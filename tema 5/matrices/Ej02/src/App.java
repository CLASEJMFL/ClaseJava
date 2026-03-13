public class App {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa que cree un array de 10 números enteros generados aleatoriamente (1,100) 
        ambos incluido, los visualice recorriéndolo con el for each y también recorriéndolo en orden decreciente. 
        En uno de los recorridos debes calcular el sumatorio total de dichos números y visualizarlo,.
        */

        // Variable
        int numeros [];
        numeros = new int[10];
        
        // Programa
        for (int i = 0; i < 10; i++) {
            int numran = (int) (Math.random() * 100) + 1;
            numeros[i] = numran;
        }

        for (int e = 0;e < 10 ;e++) {
            System.out.println(numeros[e]);
        }
        System.out.println("========================");
        System.out.println("========================");
        for (int e : numeros) {
            System.out.println(e);
        }
    }
}
