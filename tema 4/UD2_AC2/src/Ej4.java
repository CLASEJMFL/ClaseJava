import java.util.Scanner;

public class Ej4 {
    public void ej4() {
    // Variables
    double precio = 80;
    boolean clienteVip = true;
    boolean descuentoActivo = false;

    // Terminamos las condiciones simples
    if ((precio > 50) && ((clienteVip == true) || (descuentoActivo == true))) {
        System.out.println("El precio total es: " + precio * 0.15);
    }
     if ((precio < 50) || ((clienteVip == false) || (descuentoActivo == false))) {
        System.out.println("El precio total es: " + precio);
    }
    
    }
}