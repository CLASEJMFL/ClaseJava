import java.util.Arrays;
import java.util.Collections;

public class App {
    /* 
    Escribe un programa que cree un array de 10 números enteros generados aleatoriamente del 
    (1,100) ambos inclusive, y los muestre ordenados ascendente y descendentemente. Para mostrarlos, utilizar el método toString().
    Busca información en internet para ver como puedes mostrarla en orden descendente utilizando el mismo método sort() y Collections.reverseOrder()
    */
    public static void main(String[] args) throws Exception {
    // Variables 
    Integer [] num;
    num = new Integer [10];
        
    // Programa
    for (Integer i=0; i < 10; i++) {
        int numran = (int) (Math.random() * 100) + 1; // generamos los numeros de 1 a 100
        num [i] = numran; // el array con el numero i se le van introduciendo datos
    }

    // Salida
    java.util.Arrays.sort(num);
    System.out.println("Array ordenado:" + Arrays.toString(num));
    Arrays.sort(num, Collections.reverseOrder());
    System.out.println("Array ordenado reverse :" + Arrays.toString(num));
    }
}
