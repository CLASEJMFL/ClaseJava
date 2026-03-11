import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) throws Exception {
       /* 
       Pide al usuario el número de horas trabajadas y la categoría, y muestra el sueldo semanal resultante. 
       Usa un switch expression con yield para el default.
       */

      // Variables
      int horas;
      char cat;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dime las horas que tienes trabajadas");
      horas = sc.nextInt();
      System.out.println("Dime que categoria tienes");
      cat = sc.next().charAt(0);

      // Programa
      String salario = switch (cat) {
        case 'A', 'a' -> "Su salario semanal es = " + (25 * horas);
        case 'B', 'b' -> "Su salario semanal es = " + (20 * horas);
        case 'C', 'c' -> "Su salario semanal es = " + (15 * horas);
        case 'D', 'd' -> "Su salario semanal es = " + (10 * horas);
        default -> {
          System.out.println("Categoria no valida");
          yield "ERROR";
        }
      };
      // Salida
      System.out.println(salario);
    
      sc.close();
    }
}
