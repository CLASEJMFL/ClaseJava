public class Ej04 {
    public static void main(String[] args) throws Exception {
        
        // Variable
        int num =1;

        // Programa
        while (num < 40) {
        if (num%4 == 0) System.out.println("ZAS");
        if (num%6 == 0) System.out.println("Boom");
        if (num%9 == 0) System.out.println("CRASH!");
        if (num%4 != 0 && num%4 != 6 && num%9 != 0) System.out.println(num);
        num ++;
       }
    }
}
