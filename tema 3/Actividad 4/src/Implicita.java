public class Implicita {
    public static void main(String[] args) {
        int entero = 100;

        // 1.Convertir int a double (Implicita: int -> double)
        double decimal = entero;
        System.out.println("int (" + entero + ") a double" + decimal);
        
        // 2. Convertir chat a int (Implícita: chat -> int)
        char letra = 'A';
        int ascii = letra;
        System.out.println("chat ('" + letra + "') a int (ASCII): " + ascii);
    }
}
