package ejercicofinal;

/**
 *
 * @author Renato
 */
public class Principal {
    public static void main(String[] args) {
        // Objeto #1
        Equipo e = new Equipo();   // Utilizamos el Constructor #1
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e.obtener_nombre(), e.obtener_num_jugadores(), e.obtener_ciudad()); // Presentar datos
        
        // Objeto #2
        Equipo e2 = new Equipo("Liga de Loja"); // Utilizamos el Constructor #2
        e2.agregar_num_jugadores(20);
        e2.agregar_ciudad("Loja");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e2.obtener_nombre(), e2.obtener_num_jugadores(), e2.obtener_ciudad()); // Presentar datos
        
        // Objeto #3
        Equipo e3 = new Equipo("Liga de Quito", 25); // Utilizamos el Constructor #3
        e3.agregar_ciudad("Quito");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e3.obtener_nombre(), e3.obtener_num_jugadores(), e3.obtener_ciudad()); // Presentar datos
        
        // Objeto #4
        Equipo e4 = new Equipo("Liga de Tulcan", 30, "Tulcan"); // Utilizamos el Constructor #4
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e4.obtener_nombre(), e4.obtener_num_jugadores(), e4.obtener_ciudad()); // Presentar datos
    
    }
}
