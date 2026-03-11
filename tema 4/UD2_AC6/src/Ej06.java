import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que practique el cálculo mental del usuario. En cada ronda se
        generan dos números aleatorios entre 1 y 100, y el usuario debe escribir su suma. El juego
        continúa mientras las respuestas sean correctas. Cuando falle, el programa mostrará el número
        total de aciertos.
        */

        // Variables
        int num1 = (int)(Math.random() * 100), num2 = (int)(Math.random() * 100), num, contador = 0;
        Scanner sc = new Scanner(System.in);
        boolean respuesta = true;
        // Programa
        do {
            System.out.println("El primer numero es " + num1 + " el segundo es " + num2);
            System.out.println("--------------------------------------");
            System.out.println("Dime cuanto suman");
            System.out.println("--------------------------------------");
            num = sc.nextInt();
            if (num == (num1 + num2)) {
                System.out.println("Respuesta correcta");
                num1 = (int)(Math.random() * 100);
                num2 = (int)(Math.random() * 100);
                contador ++;
            } else {
                respuesta = false;
            }
        } while (respuesta == true);
        
        // Salida
        System.out.println("Enorabuena tuviste " + contador + " aciertos");
        
        sc.close();
    }
}
