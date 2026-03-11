import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite un número al usuario entre 2 y 9 (repetir hasta que la entrada sea
        correcta). A continuación, el programa dibujará la siguiente figura:
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        int contar= 0;
        String cadena = "";
        System.out.println("Dame un numero de 2 a 9");
        int num = sc.nextInt();
        if (num < 2 || num > 9) {
            for (;;) {
                System.out.println("Dame un numero de 2 a 9");
                num = sc.nextInt();
                if (num >= 2 && num <= 9) break;
            }
        }

        // Programa
        for (;num > 0; num--) {
            for (contar = 0; contar < num ; contar++) {
                cadena = cadena + "*";
            }
            System.out.println(cadena + " (" + num + ")");
            cadena = "";
        }
        sc.close();
    }
}
