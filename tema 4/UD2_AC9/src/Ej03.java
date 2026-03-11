import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite al usuario un número comprendido entre 1 y 99. El
        programa debe mostrarlo con letras. 
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entre 1 y 99");
        int num = sc.nextInt();
        if (num < 1 || num > 99) {
            for (;;) {
                System.out.println("Dije un numero entre 1 y 99");
                num = sc.nextInt();
                if (num > 0 && num < 99) break;
            }
        }
        int longitud = String.valueOf(num).length();
        sc.close();
        System.out.println(longitud);

        // Programa
        if (longitud == 1) {
            String unidades = switch (num) {
                case 1 -> "uno";
                case 2 -> "dos";
                case 3 -> "tres";
                case 4 -> "cuatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "siete";
                case 8 -> "ocho";
                case 9 -> "nueve";
                default -> "Error";
            };
        }
    }
}
