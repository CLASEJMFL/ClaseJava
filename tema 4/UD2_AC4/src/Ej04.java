import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) throws Exception {
       /* 
       Pide al usuario el número del mes y muestra la estación del año correspondiente: invierno, primavera, verano u otoño.
       */

      // Variables
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dame un mes del 1 al 12");
      num = sc.nextInt();

      // Programa
      String estacion = switch (num) {
        case 12, 1, 2 -> "Invierno";
        case 3, 4, 5 -> "Primavera";
        case 6, 7, 8 -> "Verano";
        case 9, 10, 11 -> "Otoño";
        default -> "¡ERROR! El numero que introduciste no pertenece a ningun mes";
      };

      // Salida
      System.out.println("El mes esta en la estacion de = " + estacion);
    sc.close();
    }
}
