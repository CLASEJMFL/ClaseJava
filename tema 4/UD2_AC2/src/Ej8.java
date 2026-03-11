import java.util.Scanner;

public class Ej8 {
    public void ej8() {
    // Variables
    int edad;
    String mayor = "Mayor de edad";
    Scanner sc = new Scanner
    (System.in);

    // Pedimos informacion
    System.out.println("Dime la edad");
    edad = sc.nextInt();

    // Terminamos las condiciones simples
    if (edad > 18) {
        System.out.println(mayor);
    }

    }
}