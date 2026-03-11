import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida un número entero al usuario. A continuación, se calculará su factorial
        (Ejemplo, factorial de 5! es 5x4x3x2x1 = 120).
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt(), mult = 1;

        // Programa
        for (; num > 1; num--) {
            mult = mult * num;
        }

        // Salida
        System.out.println("El total es " + mult);
        sc.close();
    }
}
