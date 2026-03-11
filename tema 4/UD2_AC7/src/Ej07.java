import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida un número positivo entero. A continuación, el programa calculará y
        nos indicará si se trata de un número primo o no.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        boolean primo = false;
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        // Programa 
        for (int i = 2; i < (num - 1); i++) {
            if (num%i == 0) {
                primo = false;
                break;
            }
        }

        // Salida
        if (primo == true) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
        sc.close();   
    }
}