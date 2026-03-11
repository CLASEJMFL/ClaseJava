import java.util.List;

public class Unboxing {
    public static void main(String[] args) {
        Integer iObj = Integer.valueOf(200);
        int i = iObj;
        Character cObj = Character.valueOf('B');
        char c = cObj;
        Boolean bObj = Boolean.TRUE;
        boolean b = bObj;
        Double dObj = Double.valueOf(50.5);
        double d = dObj;
        Long lObj = Long.valueOf(101010L);
        long l = lObj;
        Float fObj = Float.valueOf(9.9f);
        float f = fObj;
        Short sObj = Short.valueOf((short)10);
        short s = sObj;
        Byte byObj = Byte.valueOf((byte)5);
        byte by = byObj;
        Integer x = 5;
        int suma = x + 2;
        List<Integer> list = List.of(30);
        int valor = list.get(0);
    }    
}
