import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) throws Exception {
       /* 
       Elabora un programa que realice la operación seleccionada entre las siguientes opciones:
              a: Calcular el área de un triángulo (pidiendo base y altura).
              b: Calcular el área de un cuadrado (pidiendo el lado).
              c: Calcular el área de un círculo (pidiendo el radio).
              d: Calcular el área de un rectángulo (pidiendo base y altura).
        Utiliza un switch expression con yield para devolver el resultado según la opción elegida.
       */

      // Variables
      int base, altura, lado, radio;
      Scanner sc = new Scanner(System.in);
      char opcion;
      System.out.println("============================ MENU ============================");
      System.out.println("a: Calcular el área de un triángulo (pidiendo base y altura).");
      System.out.println("b: Calcular el área de un cuadrado (pidiendo el lado).");
      System.out.println("c: Calcular el área de un círculo (pidiendo el radio).");
      System.out.println("d: Calcular el área de un rectángulo (pidiendo base y altura).");
      System.out.println("==============================================================");
      opcion = sc.next().charAt(0);

      // Programa
     
      int resultado = switch (opcion) {
        case 'A', 'a' -> {
          System.out.println("Dame la base de tu triangulo");
          base = sc.nextInt();
          System.out.println("Dame la altura del triangulo");
          altura = sc.nextInt();
          yield (base * altura) / 2;
        }
        case 'B', 'b' -> {
          System.out.println("Dame cuando mide un lado del cuadrado");
          lado = sc.nextInt();
          yield lado * lado;
        }
        case 'C', 'c' -> {
          System.out.println("Dame el radio de su circuloi");
          radio = sc.nextInt();
          yield (int)(3.1415 * (radio * radio));
        }
        case 'D', 'd' -> {
          System.out.println("Dame el lado del rectangulo");
          lado = sc.nextInt();
          System.out.println("Dame la altura del rectangulo");
          altura = sc.nextInt();
          yield altura * lado;
        }
        default -> {
          System.out.println("Opcion no valida en el menu");
          yield 0;
        }
      };
      // Salida
      System.out.println("El area es: " + resultado);
    sc.close();
    }
}
