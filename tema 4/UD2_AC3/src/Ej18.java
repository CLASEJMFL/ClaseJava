import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) throws Exception {
        /*
        Pide tres lados de un triángulo y determina si es equilátero, isósceles o escaleno.
        */
       
        // Variables
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        // Pedimos datos
        System.out.print("Introduce el lado a: ");
        a = sc.nextDouble();
        System.out.print("Introduce el lado b: ");
        b = sc.nextDouble();
        System.out.print("Introduce el lado c: ");
        c = sc.nextDouble();

        // Programa
        if ((a == b) && (b == c)) {
            System.out.println("El triángulo es equilátero.");
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }
}
