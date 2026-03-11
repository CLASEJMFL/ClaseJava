import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) throws Exception {
       /* 
      Elabora un programa que muestre el siguiente menú de opciones:
            Calcular el cubo de un número.
            Determinar si un número es par o impar.
            Salir.
            Utiliza un switch tradicional, ya que las acciones dependen de la opción seleccionada en el menú.
       */

      // Variables
      int opcion, num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dame un numero");
      num = sc.nextInt();
      System.out.println("=================== Menu ===================");
      System.out.println("1 - Calcular el cubo de un número.");
      System.out.println("2 - Determinar si un número es par o impar.");
      System.out.println("3 - Salir.");
      System.out.println("============================================");
      opcion = sc.nextInt();

      // Programa y salida
      switch (opcion) {
        case 1:
          System.out.println("El cubo del numero es = " + (num * num * num));
         break;
        case 2:
          if (num % 2 == 0) {
            System.out.println("El numero es par");
          } else {
            System.out.println("El numero es impar");
          }
        break;
        case 3:
          System.out.println("Saliendo");
        break;
        default:
          System.out.println("Opción no valida");  
        break;
      }
    sc.close();
    }
}
