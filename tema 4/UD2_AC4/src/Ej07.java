import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) throws Exception {
       /* 
       Pide al usuario los tres lados de un triángulo y determina si es equilátero, isósceles o escaleno.
          Un triángulo equilátero tiene los tres lados iguales.
          Un triángulo isósceles tiene exactamente dos lados iguales.
          Un triángulo escaleno tiene los tres lados distintos.
          Utiliza un switch tradicional, empleando una variable que indique cuántos lados son iguales.
       */

      // Variables
      int lado1, lado2, lado3, num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dame un lado del triangulo");
      lado1 = sc.nextInt();
      System.out.println("Dame otro lado del triangulo");
      lado2 = sc.nextInt();
      System.out.println("Dame otro lado del triangulo");
      lado3 = sc.nextInt();

      // Programa y salida
      if (lado1 == lado2 && lado1 == lado3) {
        num = 3;
      } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3 && lado2 != lado3 || lado1 != lado2 || lado1 != lado3) {
        num = 2;
      } else {
        num = 1;
      }
      
      switch (num) {
        case 1:
          System.out.println("Es un triangulo escaleno");
        break;
        case 2:
          System.out.println("Es un triangulo isoceles");
        break;
        case 3:
          System.out.println("Es un triangulo equilatero");
        break;
        default :
         System.out.println("ERROR");
        break;
      };
    sc.close();
    }
}
