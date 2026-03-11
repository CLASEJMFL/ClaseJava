import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida 5 calificaciones de alumnos y, después, nos diga si hay alguno
        suspenso.
        */

        // Variables
        int num, contador = 0;
        Scanner sc = new Scanner(System.in);

        // Programa
        for (int i = 1; i < 5; i++) {
            System.out.println("Dame un numero");
            num = sc.nextInt();
            if (num < 5) {
                contador++;
            }
        }
        System.out.println("De los 5 alumnos " + contador + " suspendieron ");
        sc.close();
    }
}
