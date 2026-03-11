import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida al usuario un número del 1 al 10 (repitiendo hasta que esté dentro
        del rango). A continuación, el programa mostrará la tabla de multiplicar de ese número.
        */

        // Variables
        int num = 0;
        Scanner sc = new Scanner(System.in);

        // Programa y salida
        for (;;) {
            System.out.println("Dame un numero");
            num = sc.nextInt();
            if (num < 0 || num > 10) break;
            for (int i = 1; i < 10 ; i++) {
                System.out.println(num + " * " + i + " es " + (i * num));
            }
        }
        
        System.out.println("Programa finalizado");
        sc.close();
    }
}
