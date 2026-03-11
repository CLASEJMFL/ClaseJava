import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) throws Exception {
        // Pide un número entero y muestra si es par y mayor que 10, o si no cumple ambas condiciones.
        
        // Variables
        int numero, parimpar;; 
        Scanner sc = new Scanner
        (System.in);
        
        // Programa
        System.out.println("Dame un numero");
        numero = sc.nextInt();
        parimpar = (numero % 2);
        if ((parimpar == 0) && (numero > 10)) {
            System.out.println("El numero : " + numero + " es par y es mayor a 10");
        } else {
            System.out.println("El numero: " + numero + " no cumple las condiciones");
        }
    }
}
