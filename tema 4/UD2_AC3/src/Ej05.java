import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) throws Exception {
        /*
        Pide una temperatura en grados Celsius y muestra:
        “Temperatura estable” si está entre –1 y 1 (sin incluir los extremos),
        “Por debajo del punto de equilibrio” si es menor que –1,
        “Por encima del punto de equilibrio” si es mayor que 1.
        Si la temperatura introducida no está dentro del rango razonable (–100 a 100), muestra “Temperatura fuera de rango”.
        */

        // Variables
        int temp;
        Scanner sc = new Scanner
        (System.in);

        // Pedimos datos
        System.out.println("Dame la temperatura");
        temp = sc.nextInt();

        // Programa
        if ((temp > -1) && (temp < 1)) {
            System.out.println("Temperatura estable");
        } else if ((temp < -1) && (temp > -100)) {
            System.out.println("Por debajo del puinto de equilibrio");
        } else if ((temp > 1) && (temp < 100)) {
            System.out.println("Por encima del punto de equilibrio");
        } else {
            System.out.println("Temperatura fuera de rango");
        }
    }
}
