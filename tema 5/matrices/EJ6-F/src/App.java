import java.util.Arrays;
        /*
        Crear una tabla bidimensional de longitud 5 x 5 y rellenarla de la siguiente forma: 
        el elemento de la posición [n][m] debe contener el valor 10 x n + m. 
        Después se debe mostrar su contenido, para ello debes hacerlo creando tres métodos que 
        devuelvan el tipo de dato String con el que se visualizará la pantalla.

            1.- Bucles anidados.
            2.- Bucle utilizando el método Arrays.toString(array)
            3.- Uso del método Arrays.deepToString()
        */
public class App {
    public static void main(String[] args) {

        int[][] tabla = new int[5][5];

        // RELLENAR TABLA
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                tabla[n][m] = 10 * n + m;
            }
        }

        // MOSTRAR LOS BUCLES ANIDADOS
        System.out.println("BUCLES ANIDADOS:");
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(tabla[n][m] + " ");
            }
            System.out.println();
        }

        // MOSTRAR TABLA CON EL TOSTRING
        System.out.println("\nARRAYS.TOSTRING:");
        for (int n = 0; n < 5; n++) {
            System.out.println(Arrays.toString(tabla[n]));
        }

        // MOSTRAR LA TABLA CON EL DEEPTOSTRING
        System.out.println("\nARRAYS.DEEPTOSTRING:");
        System.out.println(Arrays.deepToString(tabla));
    }
}
