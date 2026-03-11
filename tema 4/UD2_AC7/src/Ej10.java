import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que solicite al usuario el número de filas y columnas (ambos mayores que
        cero). A continuación, el programa dibujará un rectángulo (cuadrado en caso de que sean iguales¿?) de asteriscos con esas dimensiones.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        System.out.println("Dame el lado de la columna");
        int columna = sc.nextInt();
        System.out.println("Dame el lado de la fila");
        int fila = sc.nextInt();

        // Programa
        if (columna > 0 && fila > 0) {
           for (int i = 0; i < columna; i++ ) {
            for (int e = 0; e < fila; e++) {
                cadena = (cadena + " * ");   
            }
            System.out.println(cadena);
            cadena = "";
        }
        }
        sc.close();
    }
}
