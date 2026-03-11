import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) throws Exception {
        // Solicita un número entero y muestra si es múltiplo de 3, de 5, de ambos o de ninguno.
        
        // Variables
        int num;
        Scanner sc = new Scanner(System.in);

        // Pedimos las variables
        System.out.println("Dame un numero");
        num = sc.nextInt();
        
        // Programa
        if ((num%3 == 0) || (num%5 == 0)) {
            if ((num%3 == 0) && (num%5 == 0)) {
                System.out.println("El numero: " + num + " es divisible entre 3 y 5");
            } else if (num%3 == 0) {
                System.out.println("El numero: " + num + " es divisible entre 3");
            } else if (num%5 == 0) {
                System.out.println("El numero: " + num + " es divisible entre 5");
            }
        } else {
            System.out.println("El numero: " + num + " no es divisible ni de 3 ni de 5");
        }
    }
}
