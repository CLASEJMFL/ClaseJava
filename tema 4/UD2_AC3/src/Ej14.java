import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) throws Exception {
        /*
        Pide el importe de una compra y muestra el tipo de descuento aplicable: 0 % si es menor de 50 €, 5 % si está entre 50 € y 100 €, y 10 % si supera 100 €.
        */

        // Variables
        double importe;
        Scanner sc = new Scanner(System.in);

        // Pedimos variables
        System.out.println("Dame el importe de la compra");
        importe = sc.nextDouble();

        // Programa
        if (importe > 100) {
            System.out.println("Su importe: " + importe + " se le rebajara un 10%, importe fianl = " + (importe - (importe * 0.10)));
        } else if ((importe <= 100) && (importe >= 50)) {
            System.out.println("Su importe: " + importe + " se le rebajara un 10%, importe fianl = " + (importe - (importe * 0.05)));
        } else {
            System.out.println("Su importe total es= " + importe);
        }
    }
}
