import java.util.Random;
/*
Realiza la Actividad 1 anterior de forma que la creación del array se realice en un método y la visualización del máximo y mínimo en el programa principal.
---------
Nota:
En la página 15 de la presentación puedes ver como realizarlo.
*/
public class App {
    public static int[] crearArray() {
        int[] numeros = new int[10];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // 1 a 100
        }
        return numeros;
    }

    public static void main(String[] args) {
        int[] array = crearArray();
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
