import java.util.Scanner;

public class Ej7 {
    public void ej7() {
    // Variables
    int hora;
    boolean nocturno;
    Scanner sc = new Scanner
    (System.in);

    // Pedimos informacion
    System.out.println("Dime la hora que es");
    hora = sc.nextInt();
    System.out.println("Tienes pase nocturno responde con true o false");
    nocturno = sc.nextBoolean();


    // Terminamos las condiciones simples
    if (((hora > 8 ) && (hora < 22)) || (nocturno == true)) {
        System.out.println("Acceso Concedido");
    }
    
    }
}

