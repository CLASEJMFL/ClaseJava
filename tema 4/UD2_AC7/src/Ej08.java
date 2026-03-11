public class Ej08 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que muestre todos los números primos comprendidos entre 1 y 300.
        Recuerda que el número 1 no se considera primo, porque un número primo debe tener exactamente dos
        divisores distintos: 1 y él mismo.
        */

        // Variables
        int contador = 0;

        // Programas
        for (int i = 1; i < 301; i++) {
            for (int e = 1; e < i; e ++) {
                if (e%i != 0) {
                    contador++;
                }
                if (contador == 2) {
                    System.out.println("El numero " + e + " es primo");
                }
                contador = 0;
            }
        }    
    }
}
