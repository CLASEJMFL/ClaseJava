import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que registre las temperaturas diarias. El usuario irá introduciendo las
        temperaturas por teclado y el programa mostrará la temperatura máxima y la mínima registradas.
        El proceso terminará cuando se introduzca una temperatura de -100, que actuará como valor
        centinela.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        int temp = 0, min = temp, max = temp;

        do {
            System.out.println("Dame la temperatura, usa -100 para parar");
            temp = sc.nextInt();
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        } while (temp != -100);

        // Salida
        System.out.println("Su temperatura minima es " + min + " y su maxima de " + max);
        sc.close();
    }
}
