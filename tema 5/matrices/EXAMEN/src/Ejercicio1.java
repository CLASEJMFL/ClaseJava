import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int [] numeros = {1,8,2,7,3,6,4,5};
        int max = obtenerMax(numeros);
        int min = obtenerMin(numeros);
        int[] ordenarAsc = ordenarAscendente(numeros);
        int[] ordenarDsc = ordenarDescendente(numeros);
        //Sacamos por pantalla
        System.out.print("\nNumero mas grande = "+max );
        System.out.print("\nNumero mas pequeño = "+min );
        System.out.print("\nOrden ascendente = ");
        System.out.print(Arrays.toString(ordenarAsc));
        System.out.print("\nOrden descendenete = ");
        System.out.print(Arrays.toString(ordenarDsc));
        System.out.println("");


    }

    private static int[] ordenarDescendente(int[] numeros) {
        int [] reversa = new int [numeros.length];
        int e = numeros.length-1;
        for (int i=0;i<numeros.length;i++){
            reversa[i] = numeros[e];
            e--;
        }
        return reversa;
    }


    // Ordenamos y sacamos el array ya en orden ascendente
    private static int[] ordenarAscendente(int[] numeros) {
        Arrays.sort(numeros);
        return numeros;
    }
    // Hacemos lo mismo que en el numero mas alto pero con el 0 ya que es el mas pequeño
    private static int obtenerMin(int[] numeros) {Arrays.sort(numeros);
        Arrays.sort(numeros);
        return numeros[0];
    }
    // Primero ordenamos y despues cogemos el numero mas alto que seria la longitud que tiene el array -1
    private static int obtenerMax(int[] numeros) {
        Arrays.sort(numeros);
        return numeros[numeros.length-1];

    }


}
