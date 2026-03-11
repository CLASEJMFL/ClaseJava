import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que implemente el juego del número secreto. Consiste en acertar un
        número entre 1 y 100 que el programa habrá generado de forma aleatoria.
        El usuario intentará adivinarlo insertando números por el teclado, mientras que el computador nos
        irá dando pistas indicando si su número secreto es mayor o menor a nuestros intentos.
        */

       // Variables
        int numran = (int)(Math.random() * 100), num;
        Scanner sc = new Scanner(System.in);

        // Programa
        do {
            System.out.println("Dame un numero entre 1 y 100 ");
            num = sc.nextInt();
            if (num < numran) {
                System.out.println("El numero es mayor que " + num);
            } else {
                System.out.println("El numero es menor que " + num);
            }
        } while (num != numran);
        
        System.out.println("Acertaste el numero era " + num);

       sc.close();
    }
}
