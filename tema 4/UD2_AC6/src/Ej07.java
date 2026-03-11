public class Ej07 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que calcule cuántos términos de la serie de Fibonacci son menores
        que 10.000. La serie de Fibonacci comienza con 0 y 1, y cada término siguiente se obtiene
        sumando los dos anteriores.
        El programa debe mostrar por pantalla los números de la serie y, al final, el número total de
        términos generados.
        */

        // Variables
        int num2 = 1, num1 = 0;
        String cadena = "";

        // Programa
        do {
            num2 = num1 + num2;
            cadena = (cadena + " " + + num1 + " " + num2);
            num1 = num2 + num1;
        } while (num1 <= 10000 || num2 <= 10000); 
            System.out.println(cadena);
    }
}
