import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa que pida al usuario que introduzca 10 números enteros. El programa debe
        recorrerlos con un bucle for y los irá mostrando, pero si encuentra un número negativo, mostrará
        un aviso (“Número negativo encontrado”) y se detendrá el programa inmediatamente.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Numero negativo encontrado");
        } else {
            System.out.println(num);
            for (int i = 1; i < 9; i++) {
                System.out.println("Dame un numero entero");
                num = sc.nextInt();
                if (num < 0)System.out.println("Numero negativo encontrado");
                if (num < 0) break;
            }
        }
        sc.close();
    }
}
