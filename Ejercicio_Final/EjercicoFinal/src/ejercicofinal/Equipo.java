package ejercicofinal;

/**
 *
 * @author Renato
 */
public class Equipo {
    
    // Atributos
    String nombre;      // Valor por defecto del nmbre del equipo = ""
    int num_jugadores;  // Valor por defecto del numero de jugadores = 0
    String ciudad;      // Valor por defecto de la ciudad del equipo = ""
    
    // Constructor 1
    public Equipo(){
        this.nombre = "SinNombre";      // Valor por defecto del nombre del equipo = "SinNombre"
        this.num_jugadores = 15;        // Valor por defecto de numero de jugadores = 15
        this.ciudad = "SinCiudad";      // Valor por defecto de la ciudad del equipo = "SinCiudad"
    }
    
    // Constructor 2    
    public Equipo(String nombre){
        this.nombre = nombre;               // (Recibe de parámetro el nombre del equipo)
    }
    
    // Constructor 3  
    public Equipo(String nombre, int jugadores){
        this.nombre = nombre;                // (Recibe de parámetro el nombre del equipo)
        this.num_jugadores = jugadores;      // (Recibe de parámetro el nombre del equipo)
    }
    
    // Constructor 4
    public Equipo(String nombre, int jugadores, String nombreCiudad){
        this.nombre = nombre;               // (Recibe de parámetro el nombre del equipo)
        this.num_jugadores = jugadores;     // (Recibe de parámetro el nombre del equipo)  
        this.ciudad = nombreCiudad;         // (Recibe de parámetro el nombre de la ciudad)
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
        this.num_jugadores = jugadores;                 // Agrega valor a la variable global num_jugadores
    }
    
    // Método SET de ciudad
    public void agregar_ciudad(String nombreCiudad){
        this.ciudad = nombreCiudad;                     // Agrega valor a la variable global ciudad
    }
 
   
}
