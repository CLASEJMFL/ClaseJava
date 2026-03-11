import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) throws Exception {
        // Solicita un número entero y muestra si es Cero, Positivo o Negativo.
       
        // Variables
        int numero;
        Scanner sc = new Scanner
        (System.in);

        // Programa
        System.out.println("Dame un numero");
        numero = sc.nextInt();

        System.out.println((numero > 0) ? "El numero: " + numero + " es positivo" : "El numero: " + numero + " es negativo");

    }
}
