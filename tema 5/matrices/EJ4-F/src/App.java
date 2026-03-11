import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Escribe un programa que lea y almacene n números enteros introducidos por el usuario en una tabla. A partir de esta tabla, 
            debes construir otras dos tablas con los elementos con valores pares e impares de la primera, respectivamente. 
            Las tablas pares e impares deben mostrarse ordenadas.
            Para realizar la actividad, debes utilizar los métodos de recorrido y búsqueda apropiados estudiados en clase.
        */
        Scanner sc = new Scanner(System.in);
        int[] pares = new int [0];
        int[] impares = new int[0];

        // PEDIMOS LA LONGITUD DEL ARRAY
        System.out.println("Dime de que tamaño de la tabla");
        int longitudtabla = sc.nextInt(); // METEMOS LOS DATOS EN LA TABLA
        int[] tabla = new int [longitudtabla];

        // PEDIMOS TODOS LOS DATOS QUE NOS DIJERON QUE
        for (int i = 0; i < longitudtabla;i++) {
            System.out.println("Dime el primer numero de la tabla");
            int num = sc.nextInt();
            tabla[i] = num;
        }
        
        // PEDIMOS AL METODO
        pares = numerosPares(tabla);
        impares = numerosImpares(tabla);

        // SACAMOS LOS ARRAY
        System.out.println("Los numeros pares son = "+ (Arrays.toString(pares)));
        System.out.println("Los numeros inpares son = "+ (Arrays.toString(impares)));
        sc.close();
    }

    // CON ARRAY COPYOF PODEMOS AUMENTAR EL TAMAÑO DEL ARRAY, SI FUERA CON FOR TENDRIAMOS QUE SABER PRIMERO CUANTOS PARES Y IMPARES HAY
    // CON EL FOR QUE E USADO SABEMOS SI EL NUMERO ES PAR O IMPAR

    private static int[] numerosImpares(int[] tabla) {
       int[] impares = new int[0];
       
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 != 0) {
                int posicion = Arrays.binarySearch(impares, tabla[i]);
                if (posicion < 0) {
                    impares = Arrays.copyOf(impares, impares.length + 1);
                    impares[impares.length - 1] = tabla[i];
                }
            }
            Arrays.sort(impares);
        }
        return impares;
    }

    public static int[] numerosPares(int[] tabla) {
        int[] pares = new int[0];
        
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0) {
                int posicion = Arrays.binarySearch(pares, tabla[i]);
                if (posicion < 0) {
                    pares = Arrays.copyOf(pares, pares.length + 1);
                    pares[pares.length - 1] = tabla[i];
                }
            }
            Arrays.sort(pares);
        }
        return pares; 
    }
}