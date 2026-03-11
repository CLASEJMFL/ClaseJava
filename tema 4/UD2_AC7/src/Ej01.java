import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida 10 números enteros por teclado, y muestre la media.
        */

        // Variables
        int num = 0;
        Scanner sc = new Scanner(System.in);

        // Programa
        for (int i = 1; i < 10; i++) {
            System.out.println("Dame un numero");
            num = sc.nextInt();
        }

        // Salida
        System.out.println("La media de los numeros es = " + (num / 10));
        sc.close();
    }
}
