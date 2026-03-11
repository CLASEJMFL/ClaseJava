import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) throws Exception {
        /*
        Juego de Preguntas y Respuestas. A partir de la biografía de Ada Byron, escribe un programa
        en Java que realice 5 preguntas al usuario:
            - En cada una de ellas, se ofrecerá tres posibles soluciones numeradas del 1 al 3.
            - El programa comprobará si la respuesta es correcta o no.
            - En función del resultado, el programa informará al usuario si lo ha hecho bien o mal,
        sumando diez puntos si la respuesta es correcta.
        */

        // Variables
        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        // Programa
        System.out.println("================== CUESTIONARIO ==================");
        System.out.println("¿En qué año nació Ada?");
        System.out.println("1. 1815");
        System.out.println("2. 1885");
        System.out.println("3. 1955");
        int a1 = sc.nextInt();
        if (a1 == 1) puntos++;
        System.out.println("¿Por qué es conocida Ada?");
        System.out.println("1. Diseñó la primera calculadora");
        System.out.println("2. Primer programador Informático");
        System.out.println("3. Construyó el telar programable");
        a1 = sc.nextInt();
        if (a1 == 2) puntos++;
        System.out.println("¿De quién heredó Ada su pasión por las ciencias matemáticas?");
        System.out.println("1. El Conde de Lovelace");
        System.out.println("2. Anne Isabella Milbanke");
        System.out.println("3. Joseph Marie Jacquard");
        System.out.println("==================================================");
        a1 = sc.nextInt();
        if (a1 == 2) puntos++;
        puntos = puntos * 10;
        sc.close();
        if (puntos < 10) {
            System.out.println("Enhorabuena sacaste 0 puntos");
        } else if (puntos == 10) {
            System.out.println("Enhorabuena sacaste 10 puntos");
        } else if ( puntos == 20) {
            System.out.println("Enhorabuena sacaste 20 puntos");
        } else {
            System.out.println("Enhorabuena sacaste 30 puntos");
        }
    }
}
