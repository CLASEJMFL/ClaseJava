import java.util.Scanner;
public class Ej06 {
    public static void main(String[] args) throws Exception {
        /*
        Solicita una nota numérica entre 0 y 10 y muestra: 
        “Suspenso” (0–4.99), 
        “Aprobado” (5–6.99),
        “Notable” (7–8.99)
        “Sobresaliente” (9–10). 
        Si la nota está fuera del rango, muestra “Nota no válida”. 
        */

        // Variables
        Scanner sc = new Scanner (System.in);
        double nota;

        // Solicitamos las variables
        System.out.println("Dame la nota");
        nota = sc.nextDouble();

        // Programa
        if ((nota > 0) && (nota < 10)) {
            if (nota < 5) {
                System.out.println("Suspenso");
            } else if ((nota >= 5) && (nota < 7)) {
                System.out.println("Aprobado");
            } else if ((nota >= 7) && (nota < 9)) {
                System.out.println("Notable");
            } else if ((nota >= 9) && (nota < 10)) {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println(" La nota no es valida");
        }
    }
}
