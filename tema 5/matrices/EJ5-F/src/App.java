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
        int puntuacionParticipantesExtra;
        int[] listainicial= new int [5];
        int [] listaextra = new int[0];
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i < 5;i++) {
            System.out.println("Dame la puntuacion del programador " + (i+1));
            int puntuacionParticipantes = sc.nextInt();
            listainicial[i] = puntuacionParticipantes;
        }

        System.out.println(Arrays.toString(listainicial));
        int i = 0;

        do {
            System.out.println("Dame la puntuacion si hay programador extra numero " + (i+1) + " y usa -1 para salir");
            puntuacionParticipantesExtra = sc.nextInt();
            if (puntuacionParticipantesExtra == -1) continue;
            listaextra = Arrays.copyOf(listaextra, listaextra.length + 1);
            listaextra[i] = puntuacionParticipantesExtra; 
            i++;
        }   while (puntuacionParticipantesExtra != -1);

        System.out.println(Arrays.toString(listaextra));
        int[] listafinal = new int[listaextra.length+listainicial.length];
        for (int e=0;e < listainicial.length;e++) {
            listafinal[e] = listainicial[e];
        }
        for (int e=0;e < listaextra.length;e++) {
            listafinal[listaextra.length+e] = listaextra[e];
        }
        System.out.println(Arrays.toString(listafinal));
        sc.close();
    }
}