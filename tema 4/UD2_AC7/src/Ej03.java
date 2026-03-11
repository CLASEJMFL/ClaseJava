import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que calcule la suma de los 10 primeros números impares.
        */

        // Variables
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        // Programa
        for (int i = 1; i < 10 ; i++) {
            if (i%2 != 0 ) {
                suma = suma + i;
            }
        }

        // Salida 
        System.out.println("La suma de los primeros numero impares es " + suma);
        sc.close();
    }
}
