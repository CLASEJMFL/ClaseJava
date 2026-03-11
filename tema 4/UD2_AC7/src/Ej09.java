public class Ej09 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que calcule y muestre en pantalla la siguiente salida:
        */

        // Variables
        String cadena = "";

        // Programa

        for (int i = 0; i < 10; i++ ) {
            for (int e = 0; e < 10; e++) {
                cadena = (cadena + i + e + " ");   
            }
            System.out.println(cadena);
            cadena = "";
        }
    }
}
