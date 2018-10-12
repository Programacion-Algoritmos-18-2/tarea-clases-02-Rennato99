package ejercicofinal;

/**
 *
 * @author Renato
 */
public class Equipo {
    String nombre;
    int num_jugadores;
    String ciudad;
    
    // Constructor 1
    public Equipo(){
        this.nombre = "SinNombre";
        this.num_jugadores = 15;
        this.ciudad = "SinCiudad";    
    }
    
    // Constructor 2
    public Equipo(String nombre){
        this.nombre = nombre;
    }
    
    // Constructor 3
    public Equipo(String nombre, int jugadores){
        this.nombre = nombre;
        this.num_jugadores = jugadores;
    }
    
    // Constructor 4
    public Equipo(String nombre, int jugadores, String nombreCiudad){
        this.nombre = nombre;
        this.num_jugadores = jugadores;
        this.ciudad = nombreCiudad;
    }
    
    // Métodos GET nombre
    public String obtener_nombre(){
        return this.nombre;
    }
    
    // Metodo GET de num_jugadores
    public int obtener_num_jugadores(){
        return this.num_jugadores;
    }
    
    // Metodo GET de ciudad
    public String obtener_ciudad(){
        return this.ciudad;
    }
    
    // Método SET de num_jugadores
    public void agregar_num_jugadores(int jugadores) {
        this.num_jugadores = jugadores;
    }
    
    // Método SET de ciudad
    public void agregar_ciudad(String nombreCiudad){
        this.ciudad = nombreCiudad;
    }
 
    
}
