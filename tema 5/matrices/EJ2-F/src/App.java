/*
Cada apuesta de La Primitiva consiste en seleccionar 6 números de una tabla de 49 (números del 1 al 49), y el reintegro (número del 0 al 9).
Cada sorteo determina 6 números de la combinación, un complementario y un reintegro. 
Tantos los 6 números de la combinación como  el complementario son números del 1 al 49 y el reintegro es un número del 0 al 9. 
Todos los números del sorteo van a ser aleatorios y no se pueden repetir

Desarrolla un programa que simule la compra de un boleto de dos apuestas de la primitiva. 
Los 6 números de cada apuesta y el número del reintegro del boleto son aleatorios.
1.- Visualiza tu boleto por pantalla. Los 6 números de la combinación deben estar ordenados.
2.- Simula el sorteo generando de forma aleatoria todos los números necesarios 
(ordenando los 6 números de la combinación ganadora) y visualizarlo por pantalla.
3.- Indica los números acertados, incluyendo el complementario y si has acertado el reintegro.
*/
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rd = new Random();
        int []boleto1 = crearboleto();
        int reintegro1 = crearreintegro();
        int []boleto2 = crearboleto();
        int reintegro2 = crearreintegro();
        int []premiado = crearboleto();
        int reintegropremiado = crearreintegro();
        
        
           
        System.out.print("Boleto 1 = ");
        System.out.println(Arrays.toString(boleto1));
        System.out.println("Numero de reintegro= "+reintegro1);
        System.out.println("=====================================");
        for (int e=0;e<6;e++){
            if (boleto1[e]==premiado[e]) System.out.println("Numero " + boleto1[e]+" esta premiado");
            if (boleto1[e]!=premiado[e]) System.out.println("Numero " + boleto1[e]+" no esta premiado");
        }
        if (reintegro1==reintegropremiado) System.out.println("El numero de reintegro numero "+reintegro1+" es el correcto");
        System.out.println("=====================================");
        System.out.print("Boleto 2 = ");
        System.out.println(Arrays.toString(boleto2));
        System.out.println("Numero de reintegro= "+reintegro2);
        for (int e=0;e<6;e++){
            if (boleto2[e]==premiado[e]) System.out.println("Numero " + boleto2[e]+" esta premiado");
            if (boleto2[e]!=premiado[e]) System.out.println("Numero " + boleto2[e]+" no esta premiado");
        }
        if (reintegro2==reintegropremiado) System.out.println("El numero de reintegro numero "+reintegro2+" es el correcto");
        do {

        } while (true);
    }

    public static int crearreintegro() {
        Random rd = new Random();
        int aleatorio = rd.nextInt(10);
        return aleatorio;
    }

    public static int[] crearboleto() {
        int [] boleto = new int[6];
        Random rd = new Random();
        for (int i =0;i<boleto.length;i++){
            int aleatorio = rd.nextInt(50);
            boleto[i]=aleatorio;
        }
        Arrays.sort(boleto);
        return boleto;
    }
}