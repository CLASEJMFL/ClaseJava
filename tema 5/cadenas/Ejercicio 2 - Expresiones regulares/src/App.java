/*
Imagina que recibimos un log de un sensor de temperatura y queremos extraer solo los números y la unidad (C o F), es decir, 
extraer una cadena numérica seguida de la letra C o F. Recuerda que si quieres encontrar un patrón dentro de una frase debes utilizar find() y agrupar.
Ejemplo de log: "Error en sensor 1: Temperatura actual 25C. Sensor 2: 30F."
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String log = "Error en sensor 1: Temperatura actual 25C. Sensor 2: 30F.";
        Pattern pt = Pattern.compile("(\\d{1,3})\s?([CF])");
        Matcher mt = pt.matcher(log);

        System.out.println();
        while (mt.find()) {
            System.out.println("-----------");
            System.out.println("Medicion completa: " + mt.group(0));
            System.out.println("Número: " + mt.group(1));
            System.out.println("Unidad: " + mt.group(2));
            System.out.println("-----------");
            System.out.println();
        }
    }
}
