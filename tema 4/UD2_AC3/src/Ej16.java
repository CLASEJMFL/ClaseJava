import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) throws Exception {
        /*
        Pide un carácter y determina si es una vocal minúscula, vocal mayúscula o no es vocal.
        */

        // Variables
        char letra;
        Scanner sc = new Scanner(System.in);

        // Pedimos la variable
        System.out.println("Dame un caracter");
        letra = sc. next().charAt(0);

        // Programa 
        if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
            System.out.println(letra + " = es una vocal minuscula");
        } else {
            if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
                System.out.println(letra + " = es una vocal mayuscula");
            } else {
                System.out.println(letra + " no es una vocal");
            }
        }
    }
}
