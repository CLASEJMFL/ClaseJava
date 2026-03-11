import java.util.Scanner;
public class Ej13 {
    public static void main(String[] args) throws Exception {
        /*
        Pide un año y muestra si pertenece al siglo XX (1901–2000), al siglo XXI (2001–2100) o “Fuera de rango”. 
        */

        // Variables
        int year;
        Scanner sc = new Scanner(System.in);

        // Pedimos la variable
        System.out.println("Dame un año");
        year = sc.nextInt();

        // Programa
        System.out.println(((year >= 1901) && (year <= 200)) ? "XX" : ((year >= 2001) && (year <=2100) ? "Fuera de rango" : "El rango es mejor a 1901 o mayor a 2100 ¡ERROR!"));
    }
}
