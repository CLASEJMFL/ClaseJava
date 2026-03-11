import java.util.Arrays;
import java.util.Scanner;
/*
El «número de la suerte» de una persona puede calcularse a partir de sus números favoritos. 
De entre estos, se seleccionan dos diferentes al azar, que se eliminarán de la lista, 
pero en su lugar se añade la media aritmética de los dos eliminados a la lista de números
favoritos. 
El proceso se repite hasta que solo quede un número, que resultará el número de la suerte para esa persona.
Para calcular bien el número de la suerte es imprescindible que la lista de números se encuentre siempre ordenada.
Escribe una aplicación que solicite al usuario sus números favoritos y calcula su número de la suerte.
*/
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] listainicial;
        int num1 = 0;
        int num2 = 0;
        
        do {
            System.out.println("\nDame tu primer numero de la suerte");
            num1 = sc.nextInt();
            System.out.println("\nDame tu segundo numero de la suerte");
            num2 = sc.nextInt();
        } while (num1<0 || num2<0);
        // METODOS
        listainicial = crearListaInicial(num1, num2);
        System.out.println(Arrays.toString(listainicial));
        listainicial = numeroEspecial(listainicial);

        // SACAMOS INFORMACION
        System.out.println("Su numero de la suerte es " + Arrays.toString(listainicial));
        sc.close();
    }

    public static int[] numeroEspecial(int[] listainicial) {

        int[] listacontraste;
        int ran1 = 0;
        int ran2 = 0;

        while (listainicial.length != 1) {

            listacontraste = new int[listainicial.length - 2];

            // COGEMOS 2 NUMEROS ALEATORIOS DISTINTOS
            ran1 = (int) (Math.random() * listainicial.length);
            do {
                ran2 = (int) (Math.random() * listainicial.length);
            } while (ran1 == ran2);

            // COPIAMOS MENOS LOS 2 QUE QUITAMOS
            int pos = 0;
            for (int i = 0; i < listainicial.length; i++) {
                if (i == ran1 || i == ran2) continue;
                listacontraste[pos] = listainicial[i];
                pos++;
            }

            // CALCULAMOS LA MEDIA
            int numeroextra = (listainicial[ran1] + listainicial[ran2]) / 2;
            System.out.println("Numeros eliminados " +listainicial[ran1] + " y "+ listainicial[ran2]+ " numero a añadir "+ numeroextra);

            // AÑADIMOS LA MEDIA AL FINAL
            listainicial = Arrays.copyOf(listacontraste, listacontraste.length + 1);
            System.out.println(Arrays.toString(listainicial));
            listainicial[listainicial.length - 1] = numeroextra;
            Arrays.sort(listainicial);
            
        }
        return listainicial;
    }

    public static int[] crearListaInicial(int num1, int num2) {

        int[] listainicial;
        int numeroinicio;
        int numerofinal;

        if (num1 < num2){
            numeroinicio = num1;
            numerofinal = num2;
        } else {
            numeroinicio = num2;
            numerofinal = num1;
        }

        listainicial = new int[numerofinal - numeroinicio];
        int posicion = 0;

        for (int i = numeroinicio; i < numerofinal; i++ ){
            listainicial[posicion] = i;
            posicion++;
        }

        return listainicial;
    }
}