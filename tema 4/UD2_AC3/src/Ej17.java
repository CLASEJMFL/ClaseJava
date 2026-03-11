import java.util.Scanner;
public class Ej17 {
    public static void main(String[] args) throws Exception {
        /*
        Solicita tres números y muestra cuál es el mayor. 
        En caso de igualdad, muestra “Hay números iguales”.
        */

        // Variables
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        // Pedimos las variables
        System.out.println("Dame el primer numero");
        num1 = sc.nextInt();
        System.out.println("Dame el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Dame el tercer numero");
        num3 = sc.nextInt();

        // Programa
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Hay numeros iguales");
        } else if (num1 > num2 && num1 > num3) {
             System.out.println(num1 + " es el numero mayor");
         } else if (num2 > num1 && num2 > num3) {
             System.out.println(num2 + " es el numero mayor");
         } else {
            System.out.println(num3 + " es el numero mayor");
         }
     }
 }
