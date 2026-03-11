import java.util.Scanner;
public class Ej04 {
    public static void main(String[] args) throws Exception {
        // Pide un número y muestra si está dentro del rango [10, 50] o fuera de él.
        
        // Variables
        int num;
        Scanner sc = new Scanner
        (System.in);

        // Pedimos la variable
        System.out.println("Dame un numero");
        num = sc.nextInt();

        // Programa
        System.out.println(((num > 10 && num < 50)) ? "El numero" + num + " esta entre 10 y 50" : "El numero " + num + "esta fuera de 10 y 50" );
        }
}
