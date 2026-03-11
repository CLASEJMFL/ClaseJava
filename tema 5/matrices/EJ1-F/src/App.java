import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Escribir la función int [] rellenaPares (int longitud, int fin), que crea y devuelve una tabla ordenada de la longitud especificada, 
        que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive). Debes utilizar los 
        métodos estudiados y la programación modular.
        */
        int [] numerospares={}; // Creamos el array

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la longitud del array que quieres que rellene");
        int longitud = sc.nextInt();
        numerospares = new int [longitud]; // Ponemos la longitud del array igual al numero de longitud que pedimos

        System.out.println("Cual quieres que sea el ultimo numero posible aleatorio");
        int fin = sc.nextInt(); // Pedimos el ultimo numero disponible en el numero aleatorio
        sc.close();
        
        numerospares = rellenaPares(longitud, fin); // Le metemos los datos al metodo
        System.out.println(Arrays.toString(numerospares));
    }

    public static int[] rellenaPares(int longitud, int fin) {
        int [] numerosrellenar={};
        numerosrellenar= new int [longitud];
        Random random = new Random();
        for (int i = 0;i<longitud; i++) {
            int numero = random.nextInt(fin - 2 + 1) + 2;
            while (numero%2 != 0) {
                numero = random.nextInt(fin - 2 + 1) + 2;
            }
            numerosrellenar[i] = numero;
        }
        return numerosrellenar;
    }
}