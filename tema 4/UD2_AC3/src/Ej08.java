import java.util.Scanner;
public class Ej08 {
    public static void main(String[] args) throws Exception {
        /*
        Solicita una hora (0–23) y muestra:
        “Buenos días” (7–12), 
        “Buenas tardes” (13–20) o
        “Buenas noches” (21–6). 
        Si está fuera del rango, muestra “Hora no válida”.
        */

        // Variables
        int hora;
        Scanner sc = new Scanner (System.in);

        // Pedimos las variables
        System.out.println("Dame una hora de 0 a 23");
        hora = sc.nextInt();

        // Programa
        if ((hora > 7) && (hora < 12)) {
            System.out.println("Buenos dias");
        } else if ((hora > 13) && (hora < 20)) {
            System.out.println("Buenas tardes");
        } else if (((hora > 21) && (hora < 23)) || ((hora > 0) && (hora < 7))) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Hora no válida");
        }
    }
}
