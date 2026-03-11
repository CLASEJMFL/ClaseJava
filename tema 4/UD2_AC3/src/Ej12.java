import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) throws Exception {
        /*
        Pide un número entero y muestra si está dentro del rango 1–100 o fuera de él, e indica además si es par o impar.
        */

        // Variables
        int num;
        Scanner sc = new Scanner(System.in);

        // Pedimos las variables
        System.out.println("Dame un numero");
        num = sc.nextInt();

        // Programa
        System.out.println((num > 0) && (num < 100) ? "El numero esta en el rango de 0 a 100" : "El numero esta fuera de rango");
        if (num%2 == 0)  {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es inpar");
        }
    }
}
