package Paquete02;

/**
 * @author Renato
 */
public class Principal02 {

    public static void main(String[] args) {
        Precio02 p;
        p = new Precio02();
        
        System.out.println(p.obtener());
        
        p.agregar(20.2);
        System.out.println(p.obtener());
    }

}
