import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws Exception {
        // Variables
        int edad;
        boolean carnet;
        Scanner sc = new Scanner
        (System.in);

        // Pedimos las informacion al usuario
        System.out.println("Dame la edad que tienes: ");
        edad = sc.nextInt();
        System.out.println("Tienes carnet de conducir(true / false): ");
        carnet = sc.nextBoolean();

        // Uso de conducion simple
        if ((edad > 18) && (edad < 65) && (carnet == true)) {
            System.out.println("Acceso permitido");
        }
    }
}
