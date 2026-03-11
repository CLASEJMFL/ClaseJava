public class Ej01 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa que muestre los números del 1 al 100. El bucle debe detenerse
        inmediatamente cuando encuentre el primer número que sea múltiplo de 13 y de 5 al mismo
        tiempo.
        */

        // Programa
        for (int i = 1; i < 100 ;i++ ) {
            System.out.println(i);
            if (i%13 == 0 && i%5 == 0) break;
        }
    }
}
