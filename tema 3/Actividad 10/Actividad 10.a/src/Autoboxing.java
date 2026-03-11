import java.util.ArrayList;
import java.util.List;
public class Autoboxing {
    public static void main(String[] args) {
        Integer i = 100;
        Character c = 'A';
        Boolean b = true;
        Double d = 98.6;
        Long l = 123456789L;
        Float f = 3.14F;
        Short s = 500;
        Byte by = 25;

        // El resultado 8 (int) es 'autoboxed' a Integer.
        Integer resultado = 5+3;
        System.out.print(resultado);

        // El 15(int) es 'autoboxed' para poder ser añadido a la lista.
        List<Integer> numeros = new ArrayList<>(); numeros.add(15);
     }   
}