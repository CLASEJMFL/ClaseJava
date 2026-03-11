import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) throws Exception {
        /*
        Escribir un programa en Java que resuelva una ecuación de segundo grado a partir de sus
        parámetros A, B y C.
        Hay que tener en cuenta lo siguiente:
            - Si la raíz es negativa, no existe solución real. No hacer el cálculo.
            - Si tiene solución real, ha de mostrarse las soluciones.
            - Puede darse el caso de tener sólo una solución (si la raíz es cero)
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la variable a");
        int vara = sc.nextInt();
        System.out.println("Dame la variable b");
        int varb = sc.nextInt();
        System.out.println("Dame la variable c");
        int varc = sc.nextInt();
        int primerap = varb * varb; 
        int segundap = -4 * (vara * varc);
        double raiz = Math.sqrt(primerap + segundap);
        String cadena = String.valueOf(raiz);
        
        // Programa
        if (cadena == "NaN" || raiz < 0) {
            System.out.println("La raiz es negativa ");
        } else {
        double positivo = (-varb + raiz) / (2 * vara);
        double negativo = (-varb - raiz) / (2 * vara);
        System.out.println(positivo);
        System.out.println(negativo);
        }

        sc.close();
    }
}
