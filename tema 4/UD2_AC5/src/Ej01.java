public class Ej01 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que implemente los tres siguientes bucles (uno detrás de otro):
            a) Contar hasta 10
            b) Mostrar los números del 1 al 50.
            c) Mostrar los números del 0 al 100 (incluidos ambos)
        */

        // Variables
        int count1 = 0;
        
        // Programa
        while (count1 < 10) {
            count1++;
            System.out.println("Contando hasta 10: " + count1);
        }
        count1 = 0; // Reiniciamos el contador para el siguiente bucle
        while (count1 < 50) {
            count1++;
            System.out.println("Contando hasta 50: " + count1);
        }
        count1 = 0; // Reiniciamos el contador para el siguiente bucle
        while (count1 < 100) {
            count1++;
            System.out.println("Contando hasta 100: " + count1);
        }
    }
}
