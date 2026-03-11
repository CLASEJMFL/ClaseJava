import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];
        for (int i = 0;i<10;i++){
            numeros[i] = rd.nextInt(100);
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        // Nos llevamos los metodos
        int [] quitarValor = eliminarValor(numeros,sc);
        int [] añadirValor = anadirValor(numeros,sc);
        // Sacamos por pantalla
        System.out.print("Array con el numero borrado en caso de que exista = ");
        System.out.println(Arrays.toString(quitarValor));
        System.out.print("Array con numero extra = ");
        System.out.println(Arrays.toString(añadirValor));


        sc.close();
    }


    private static int[] anadirValor(int[] numeros, Scanner sc) {
    int[] añdevalor;
    System.out.print("Dame un numero del 0 al 99 que quieras añadir = ");
    int anadir = sc.nextInt();

    // Buscamos la posición donde debería ir
    int posicion = Arrays.binarySearch(numeros, anadir);

    // Si no existe, binarySearch devuelve negativo
    if (posicion < 0) {
        posicion = -posicion - 1;
    }

    // Creamos el array con una posición más
    añdevalor = new int[numeros.length + 1];

    // Copiamos la parte izquierda
    System.arraycopy(numeros, 0, añdevalor, 0, posicion);

    // Insertamos el nuevo número
    añdevalor[posicion] = anadir;

    // Copiamos la parte derecha
    System.arraycopy(numeros, posicion, añdevalor, posicion + 1, numeros.length - posicion);

    return añdevalor;
}


    private static int[] eliminarValor(int[] numeros, Scanner sc) {
        int [] eliminaValor;
        
        System.out.print("Dame un numero del 0 al 99 que quieras eliminar = ");
        int eliminar = sc.nextInt();
        int posicion = Arrays.binarySearch(numeros, eliminar);
        // Si el numero es igual o mayor a 0 significa que esta dentro del array por lo que lo sacaria
        if (posicion >= 0) {
            eliminaValor = new int [numeros.length-1];
            System.arraycopy(numeros, 0, eliminaValor, 0, posicion);
            System.arraycopy(numeros, posicion+1, eliminaValor, posicion , numeros.length-posicion-1 );
        } else { // en caso de que sea menor a 0 no esta en el array por lo que lo sacaria entero
            eliminaValor = new int[numeros.length];
            System.out.println("Su numero no esta dentro del array");
            System.arraycopy(numeros, 0, eliminaValor, 0, numeros.length);
        }

        return eliminaValor;
    }
}
