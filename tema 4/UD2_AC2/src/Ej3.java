import java.util.Scanner;

public class Ej3 {
    public void ej3() {
    // Variables
    double nota;
    Scanner sc = new Scanner
    (System.in);

   // Pedimos info
    System.out.println("Dime la nota: ");
    nota = sc.nextInt();

    // Terminamos las condiciones simples
    if ((nota > 0) && (nota < 10)) {
        System.out.println("Nota valida");
    }

    if ((nota > 9) && (nota <=10)) {
        System.out.println("Nota excelente");    
     }
     
    }
}
