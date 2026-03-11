import java.util.Scanner;
public class Ej03 {
    public static void main(String[] args) throws Exception {
        // Pide dos números y muestra: “El primero es mayor”, “
        // El segundo es mayor” o “Son iguales”. 
        // Resuélvelo usando operadores ternarios anidados (sin if–else).

        // Variables
        double num1, num2, var;
        Scanner sc = new Scanner
        (System.in);

        // Solicitamos los numeros
        System.out.println("Dame el primer numero");
        num1 = sc.nextDouble();
        System.out.println("Dame el segundo numero");
        num2 = sc.nextDouble();

        // Porgrama
        System.out.println((num1 == num2) ? "Los numeros son iguales" 
                                                                    : (num1 > num2) 
                                                                            ? "El numero " + num1 + " es mayor a " + num2 
                                                                            :  "El numero " + num2 + " es mayor a " + num1);
    }
}

