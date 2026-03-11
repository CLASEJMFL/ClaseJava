import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) throws Exception {
        // Escribe un programa en Java que pida al usuario un número y decida si es primo o no.

        // Variables
        Scanner sc = new Scanner(System.in);
        boolean primo = false;
        int calculo, count;
        System.out.println("Dame un numero");
        int num = sc.nextInt();
        count = num;

        // Programa
        while (count >= 1 || primo == true) {
            calculo = count%num;
            if (calculo == 0 && count !=1 && count != num) {
                primo = true;
            }
            count --;
        }

        // Salida
        if (primo == true) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
        sc.close();;
    }
}
