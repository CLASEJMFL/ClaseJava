import java.util.Arrays;
import java.util.Scanner;
/*
    Diseñar una aplicación para gestionar un campeonato de programación, donde se introduce la puntuación (enteros) 
    obtenidos por 5 programadores, conforme van terminando su prueba. La aplicación debe mostrar las puntuaciones ordenadas de los 5 participantes. 
    En ocasiones, cuando finalizan los 5 participantes anteriores, se suman al campeonato programadores de exhibición, cuyos puntos se incluyen con el resto. 
    La forma de especificar que no intervienen más programadores de exhibición es introducir como puntuación un -1.
    La aplicación debe mostrar, finalmente, los puntos ordenados de todos los participantes, pero solo se puede utilizar el 
    método Arrays.sort() en las puntuaciones de los programadores normales, la de los programadores de exhibición, habrá que insertarla de forma ordenada.
    Nota: El método Arrays.binarySearch() localiza un determinado elemento de la tabla, pero cuando el elemento que buscar no se encuentra, 
    el valor negativo devuelto tiene un significado especial, informa de la posición donde tendría que colocarse el elemento buscado para 
    que la tabla continúe ordenada. El índice de inserción se calcula como: indiceInsercion = -pos
    1, donde pos es el negativo devuelto por la función indicando donde debe insertarse para que siga ordenada.
*/
public class App {
    public static void main(String[] args) throws Exception {
        int[] listainicio = new int[5];
        listainicio=crearListaInicio(listainicio);
        System.out.println("\nProgramadores de inicio");
        System.out.println(Arrays.toString(listainicio));
        listainicio=crearListaExhibición(listainicio);
    }

    public static int[] crearListaInicio(int[] listainicio) {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i < 5;i++) {
            System.out.println("Dame el programador numero " + (i+1)); 
            int puntuacion = sc.nextInt();
            listainicio[i] = puntuacion;
        }
        sc.close();
        Arrays.sort(listainicio);
        return listainicio;
    }

    public static int[] crearListaExhibición(int[] listainicio) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dame el programador de exhibición numero " + (i+1)); 
            int puntuacion = sc.nextInt();
            if (puntuacion == -1) break;
            listainicio = Arrays.copyOf(listainicio, listainicio.length + 1);
            int pos = java.util.Arrays.binarySearch(listainicio, puntuacion);
            System.out.println(pos);
            i++;
        } while (true);
        sc.close();
        return listainicio;
    }
}
