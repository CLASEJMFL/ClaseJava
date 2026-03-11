import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que muestre, para cada número introducido por teclado, si es par, si
        es positivo y su cuadrado. Se terminará cuando el número introducido sea el 0. 
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dame un numero");
        num = sc.nextInt();

        if (num == 0) {
            System.out.println("Su numero es 0 cerrando");
        }

        do {
            if (num%2 == 0){
                System.out.println("Su numero es par");
            } else {
                System.out.println("Su numero es impar");
            }
             if (num < 0){
                System.out.println("Su numero es positivo");
            } else {
                System.out.println("Su numero es negativo");
            }
            System.out.println("El cuadrado de su numero es = " + (num*num));
            System.out.println("Dame un numero");
            num = sc.nextInt();
        } while (num != 0);
        sc.close();
    }
}
