public class Ej03 {
    public static void main(String[] args) throws Exception {
        /* 
        Escribe un programa en Java que implemente los tres siguientes bucles (uno detrás de otro):
            a) Contar hacia atrás desde el 7 al 0 (ambos incluidos).
            b) Contar hacia adelante desde el 1 al 25 de tres en tres.
            c) Contar hacia atrás desde el 20 al 0 de dos en dos.
        */
        // Variables
        int count = 7;

        // Programa
        // a) Contar hacia atrás desde el 7 al 0 (ambos incluidos).
        while (count >= 0) {
            System.out.println("Contando hacia atrás desde 7 al 0: " + count);
            count--;
        }
        count = 1;
        // b) Contar hacia adelante desde el 1 al 25 de tres en tres.
         while (count <= 25) {
            System.out.println("Contando hasta 25: " + count);
            count = count + 3;
        }
        count = 20;
        // c) Contar hacia atrás desde el 20 al 0 de dos en dos.
        while (count >= 0) {
            System.out.println("Contando hasta 0: " + count);
            count = count - 2;
        }
    }
}
