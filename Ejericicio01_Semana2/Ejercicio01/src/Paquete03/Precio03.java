package Paquete03;

/**
 * @author Renato
 */
public class Precio03 {

    private double euros;

    public double obtener() {
        // Todo
        return euros;
    }

    public void agregar(double x) {
        euros = x;

    }

    public Precio03() {
        agregar(30.2);
    }
    
    public Precio03(double y) {
        agregar(y);
    }
    
}
