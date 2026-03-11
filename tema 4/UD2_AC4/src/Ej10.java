import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) throws Exception {
       /* 
      Solicita al usuario un carácter y determina si es una letra, un dígito o un símbolo.
      Usa un switch expression con yield y comparaciones lógicas simples.
       */

      // Variables
      char caracter;
      int var;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dame un caracter");
      caracter = sc.next().charAt(0);

      // Programa
      if (Character.isLetter(caracter)) {
        var = 1;
      } else if (Character.isDigit(caracter)) {
        var = 2;
      } else {
        var = 3;
      }

      String resultado = switch (var) {
        case 1 -> {
          yield "El caracter es una letra.";
        }
        case 2 -> {
          yield "El caracter es un dígito.";
        }
        case 3 -> {
          yield "El caracter es un símbolo.";
        }
        default -> {
          yield "Error.";
        }
      };

    // Salida
    System.out.println(resultado);
    sc.close();
    }
}
