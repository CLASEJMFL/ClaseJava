import java.util.Scanner;

public class Ej2 {
    public void ej2() {
    // Variables
    int temp;
    boolean lluvia;
    Scanner sc = new Scanner
    (System.in);

   // Pedimos info
    System.out.println("Dime la temperatura: ");
    temp = sc.nextInt();
    System.out.println("Esta lloviendo?: (true / false");
    lluvia = sc.nextBoolean();

    // Terminamos las condiciones simples
    if ((temp > 25 && temp < 35) && (lluvia == false)) {
        System.out.println("Día perfecto para la playa" );
    }
    }
}
