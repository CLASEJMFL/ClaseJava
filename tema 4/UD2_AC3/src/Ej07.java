import java.util.Scanner;
public class Ej07 {
    public static void main(String[] args) throws Exception {
        /*
        Pide la temperatura en grados y muestra: 
        “Helada” si es menor de 0,
        “Fría” si está entre 0 y 14, 
        “Agradable” si está entre 15 y 25, o 
        “Calurosa” si supera los 25.
        */

       // Variables
       int temp;
       Scanner sc = new Scanner (System.in);

       // Pedimos datos
       System.out.println("Dame la temperatura");
       temp = sc.nextInt();

       // Programa
       if (temp < 0) {
            System.out.println("Helada");
       } else if ((temp > 0 ) && (temp < 14)) {
            System.out.println("Fría");
       } else if ((temp > 14) && (temp < 25)) {
           System.out.println("Agradable");
        } else if (temp > 25) {
            System.out.println("Caluroso");
        } 
    }
}
