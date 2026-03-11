/*
Validar que una matrícula tiene el formato correcto. Recuerda que tenemos que separar los números de las letras, 
por tanto tendremos que usar group y como tiene que coincidir toda la cadena, utilizaremos matches.
*/

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();

        // Pedimos el scanner y lo declaramos
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame la matricula que quieres validar: ");
        String log = sc.nextLine();     

        // Pattern y matcher e probado solo lo de [AEIOU] por que lo dijeron para saber si funciona de esa forma
        Pattern pt = Pattern.compile("(\\d{4})\\s?([A-Z]{3})");
        Matcher mt = pt.matcher(log);
        System.out.println("------------------");
        

        if (mt.matches() == false) {
            System.out.println("La matrícula no es válida");
        } else {
            System.out.println("Matrícula completa: " + mt.group(0));
            System.out.println("Números: " + mt.group(1));
            System.out.println("Letras: " + mt.group(2));
        }

        sc.close();
    }
}
