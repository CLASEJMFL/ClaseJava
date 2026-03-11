import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Implementar la función: int [] sinRepetidos (int miTabla []), que construya y devuelva una
        tabla de la longitud apropiada, con los elementos de miTabla, donde se han eliminado los datos repetidos.
        La tabla origen es unidimensional de 10 elementos aleatorios del 0 al 9.
        Para realizar la actividad, debes utilizar los métodos de copia y búsqueda apropiados estudiados en clase.
        */

        int[] origen = new int [10];
        Random random = new Random();
        for (int i = 0; i < 10;i++) {
            int numero = random.nextInt(0 + 9);
            origen[i] = numero;
        }
        System.out.println(Arrays.toString(origen));
        origen = sinRepetidos(origen);
        System.out.println(Arrays.toString(origen));
    }

    public static int[] sinRepetidos(int[] origen) {
        int[] sinrepetir= new int[10];
        int contador = 0;
        int numero = 100;
        Arrays.sort(origen);
        for (int i = 0; i < 10;i++) {
            if (origen[i] != numero){
                numero = origen[i];
                sinrepetir[contador] = numero;
                contador = contador+1;
            } 
        }
        contador = 0;
        for (int e = 1; e<10;e++) {
            if (sinrepetir[e] == 0) contador = contador+1;
        }
        int[] sinceros= new int[10-contador];
        for (int a = 0; a < 10-contador;a++) {
            sinceros[a] = sinrepetir[a];
        }
        return sinceros;
    }
}