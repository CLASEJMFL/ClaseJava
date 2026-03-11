import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida al usuario un número impar entre 3 y 9. Una vez obtenido el
        número, el programa debe dibujar un rombo de asteriscos cuya altura y anchura máxima correspondan al
        número introducido.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entre 3 y 9 y que sea impar");
        int num = sc.nextInt();
        if (num%2 == 0 || (num < 3 || num > 9)) {
            for (;;) {
                System.out.println("Dije entre 3 y 9 y tiene que ser impar");
                num = sc.nextInt();
                if (num%2 != 0 && (num > 3 && num < 9)) break;
            }
        }

        // Programa
        for (int i= 0 ; i < num; i++) {
            for (int e = 0; e < num - i; e++) {
                System.out.print(" ");
            }
            for (int a = 0; a < (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 2; i >= 1; i--) {
            // espacios
            for (int e = 0; e < num - i; e++) {
                System.out.print(" ");
            }
            // asteriscos
            for (int a = 0; a < (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
