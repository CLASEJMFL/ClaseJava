import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite al usuario un número comprendido entre 0 y 9999.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entre 0 y 9999");
        int num = sc.nextInt();
        if (num < 0 || num > 9999) {
            for (;;) {
                System.out.println("Dame un numero entre 0 y 9999");
                num = sc.nextInt();
                if (num > 0 && num < 9999) break;
            }
        }
        String cadena1 = String.valueOf(num);
        int longitud = String.valueOf(cadena1).length();
        char primerCaracter = cadena1.charAt(0);
        char ultimoCaracter = cadena1.charAt(longitud);

        // Programa
        if (primerCaracter == ultimoCaracter) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
        sc.close();
    }
}
