import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) throws Exception {
       /* 
       Solicita al usuario el nombre de un día de la semana en español 
       (‘lunes’, ‘martes’, …) y muestra su posición numérica (1–7).
       */

      // Variables
      String dia;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dame el nombre de un dia");
      dia = sc.nextLine();

      // Programa
      int numdia = switch (dia) {
        case "Lunes", "lunes" -> 1;
        case "Martes", "martes" -> 2;
        case "Miercoles", "miercoles" -> 3;
        case "Jueves", "jueves" -> 4;
        case "Viernes", "viernes" -> 5;
        case "Sabado", "sabado" -> 6;
        case "Domingo", "domingo" -> 7;
        default -> -1;
      };

    // Salida
    System.out.println("El dia es el numero: " + numdia);
    sc.close();
    }
}
