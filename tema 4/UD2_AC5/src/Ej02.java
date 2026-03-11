import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite al usuario un número. A continuación, utilizando un
        bucle “while”, muestre en pantalla la tabla de multiplicar de ese número del 1 al 500.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("Introduce un número para mostrar su tabla de multiplicar del 1 al 500: ");
        int numero = sc.nextInt();
        
        // Programa;
        while (count <= 500) {
            System.out.println("Tabla de multiplicar: " + numero + " x " + count + " = " + (numero * count));
            count++;
        }
        sc.close();
    }
}
