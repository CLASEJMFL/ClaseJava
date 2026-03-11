import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) throws Exception {
        // Solicita dos números y muestra si ambos son positivos, ambos negativos o de signo distinto.
        
        // Variables
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        // Solicitamos la info de las variables
        System.out.println("Dame el numero 1");
        num1 = sc.nextInt();
        System.out.println("Dame el numero 2");
        num2 = sc.nextInt();

        // Programa
        System.out.println((num1 < 0) && (num2 < 0)    ? "Los 2 numeros son negativos" 
                                                                                    : (num1 < 0) && (num2 > 0) 
                                                                                    ? "El numero 1 es negativo y el segundo positivo"
                                                                                    : (num1 > 0) && (num2 < 0)
                                                                                    ? "El numero 2 es positivo y el segundo negativo"
                                                                                    : "Ambos numeros son positivos"

    );
    }
}
