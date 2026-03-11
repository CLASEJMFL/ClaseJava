import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) throws Exception {
        /*
        Pide la edad y muestra: 
        “Edad no válida” si es negativa,
         “Infantil” si es menor de 12, 
         “Juvenil” si está entre 12 y 17 
         “Adulto” si es 18 o mayor.
        */

        // Variables
        int edad;
        Scanner sc = new Scanner(System.in);

        // Pedimos las variables
        System.out.println("Dame una edad");
        edad = sc.nextInt();

        // Programa
        if ((edad >0) && (edad < 12)) {
            System.out.println("Menor");
        } else if ((edad >12) && (edad < 18)) {
            System.out.println("Juvenil");
        } else if ((edad >= 18) && (edad < 100)) {
            System.out.println("Adulto");
        } else {
            System.out.println("Edad no válida");
        }
    }
}
