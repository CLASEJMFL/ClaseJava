import java.util.Scanner;

public class Ej6 {
    public void ej6() {
    // Variables
    int num1, num2, num3;
    Scanner sc = new Scanner
    (System.in);

    // Pedimos los numeros
    System.out.println("Dame el primer numero");
    num1 = sc.nextInt();
    System.out.println("Dame el segundo numero");
    num2 = sc.nextInt();
    System.out.println("Dame el tercero numero");
    num3 = sc.nextInt();

    // Terminamos las condiciones simples
    if ((num1 < num2) && (num2 < num3)) {
        System.out.println("Orden correcto");
    } 
    }
}

