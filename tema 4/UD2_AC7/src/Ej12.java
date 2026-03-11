import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite un número impar al usuario comprendido entre 3 y 9 (repitiendo
        la petición hasta que la entrada sea válida).
        A continuación, el programa mostrará una pirámide numérica creciente simétrica con el número de filas
        igual que el número introducido.
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
        for (int i = 1; i <= num; i += 2) {
            for (int e = 0; e < (num - i) / 2; e++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
    sc.close();
    }
}
