import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) throws Exception {
        /*
        Pide una contraseña y muestra “Acceso concedido” si coincide exactamente con “Java2025”, o “Acceso denegado” si no. Resuélvelo usando un operador ternario (una sola expresión en el println).
        */

        // Varibables
        String contrasena;
        Scanner sc = new Scanner(System.in);

        // Pedimos la variable
        System.out.println("Dame la contraseña de acceso");
        contrasena = sc.nextLine();

        // Programa
        System.out.println((contrasena == "Java2025") ? "Acceso permitido" : "Acceso denegado");
    }
}
