import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite un número impar al usuario entre 3 y 9 (repitiendo la petición
        hasta que la entrada sea válida). A continuación, el programa debe dibujar una pirámide invertida de
        asteriscos cuya base tenga exactamente ese número de asteriscos.
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
        System.out.println("================================");
        System.out.println("================================");
        System.out.println();
        System.out.println();

        // Programa
        for (int i = num; i >= 1; i--) {
            for (int e = 0; e < num - i; e++) {
                System.out.print(" ");
            }
            for (int a = 0; a < (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}