public class Ej04 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que cuente del 100 al 200 y marque qué números son divisibles entre 3.
        */

        // Variables
        int count = 100;

        // Programa
       while (count < 200) {
        if (count%3 == 0) {
            System.out.println("El numero " + count + " es divisible entre 3");
        }
        count ++;
       }
    }
}
