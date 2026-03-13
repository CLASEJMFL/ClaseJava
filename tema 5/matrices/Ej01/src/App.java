public class App {
    public static void main(String[] args) throws Exception {
        // Variables 
        int [] num;
        num = new int [10];
        int i, max = 0, min = 100;
        
        // Programa
        for (i=0; i < 10; i++) {
            int numran = (int) (Math.random() * 100) + 1; // generamos los numeros de 1 a 100
            num [i] = numran; // el array con el numero i se le van introduciendo datos
            if (numran < min) min = numran;
            if (numran > max) max = numran;
        }

        // Salida
        for (int e=0; e < 10; e++) {
            System.out.println(e+1 +" = " + num[e]); // sacamos por pantalla y los enumeramos para verlos mejor
        }
        System.out.println("el minimo es = " + min + " y el maximo es =" + max); // sacamos minimo y maximo
    }
}