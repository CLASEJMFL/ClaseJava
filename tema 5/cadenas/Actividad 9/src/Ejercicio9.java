/*
Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto que se le pasa por argumento, 
sin tener en cuenta si están escritas en mayúsculas o minúsculas.

Ayuda:
Con la instrucción siguiente, eliminamos todas los signos contiguos a una palabra como por ejemplo la coma. Ej. "El libro, ..."
palabra = palabra.replaceAll("[^a-z0-9áéíóúüñ]", "");
*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame las palabras que quieras que cuente = ");
        String cadena = sc.nextLine();
        // cadena = cadena.replaceAll("[^a-z0-9áéíóúüñ]", "");
        // Mi programa cuenta espacios en blanco y comas por lo que si pones la instruccion anterior se lo carga entero
        int contarPalabra = contador(cadena);
        System.out.println("Tiene un total de --> "+contarPalabra+" palabras");
        sc.close();
    }
    
    /**
     * 
     * @param cadena
     * @return
     */

    private static int contador(String cadena) {
        int contador = 1;
        for (int i = 0;i<cadena.length();i++) {
            char c = cadena.charAt(i); // Sacamos caracter a caracter de la adena que tenemso antes
            if (c == ' ' || c == ',') contador++; // Sumamos contador en caso de que cambie de palabra es decir que tenga un espacio o una coma
        }
        return contador;
    }
}
