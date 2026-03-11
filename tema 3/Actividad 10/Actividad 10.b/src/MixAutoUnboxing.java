import java.util.ArrayList;
import java.util.List;

public class MixAutoUnboxing {
    public static int sumarDiez(Integer numeroObjeto) {
        int resultadoPrimitivo = numeroObjeto + 10;

        return resultadoPrimitivo;
    }    
    public static void main(String[] args) {
        Integer a = 5;
        int b = a + 3;
        System.out.println("1.Resultado de 'a + 3' (Unboxing): " +b);
        Integer objetoInicial = 50;
        int resultadoSuma = sumarDiez(objetoInicial);

        System.out.print("2. Resultado de sumarDiez(50) (Unboxing):  " + resultadoSuma);
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(resultadoSuma);
        int primerElemento = numeros.get(0);
        System.out.println("3. Primer elemento de la lista (Unboxing): "  + primerElemento);
        System.out.println("   Lista de Integer con valores 'int' (Autoboxing): " + numeros);
    }
}
