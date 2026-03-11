import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) throws Exception {
       /* 
       Pide al usuario el número de hijos e indica la asignación familiar que le corresponde al trabajador. 
       El programa debe comprobar, mediante una estructura if, que el número de hijos no sea negativo. 
       Si lo es, mostrará un mensaje de error. 
       */

      // Variables
      int hijos;
      Scanner sc = new Scanner(System.in);
      System.out.println("Cuantos hijos tienes");
      hijos = sc.nextInt();

      // Programa y salida
      switch (hijos) {
        case 0:
          System.out.println("A usted no le corresponde asignación familiar");
        case 1:
          System.out.println("Le corresponden 50 €");
        case 2:
          System.out.println("Le corresponden 75€ en total");
        default:
          System.out.println("Le corresponden 100€");
      }
      sc.close();
    }
}
