import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida al usuario un número y cuente hasta dicho número,
        teniendo en cuenta que el número introducido puede ser positivo o negativo.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        // Programa
        if (num < 0 )  {
            while (num != 0) {
                System.out.println(num);
                num ++;
            }
        } else {
            while (num != 0) {
                System.out.println(num);
                num --;
            }
        }

        sc.close();
    }
}
