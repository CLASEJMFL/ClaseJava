import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite al usuario un número comprendido entre 0 y 9999.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        String numinverso= "";
        System.out.println("Dame un numero entre 0 y 9999");
        int num = sc.nextInt();
        String numero = String.valueOf(num);
        if (num < 0 || num > 9999) {
            for (;;) {
                System.out.println("Dame un numero entre 0 y 9999");
                num = sc.nextInt();
                if (num > 0 && num < 9999) break;
            }
        }
        String cadena1 = String.valueOf(num);
        int longitud = String.valueOf(cadena1).length();
        int i = longitud-1;

        // Programa
        for (;i > -1; i--) {
            numinverso =numinverso + "" + numero.charAt(i);          
        }
        int num1 = Integer.parseInt(numinverso);
        int num2 = Integer.parseInt(cadena1);

        // Salida
        if (num1 == num2) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
        sc.close();
    }
}
