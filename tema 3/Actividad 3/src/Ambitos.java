public class Ambitos {
    public static void main(String[] args) {
        {
            {
            int a = 2;
            System.out.println("a = " + a);
            }
            // La linea siguiente proyectaria un error
            // System.out.println("a = " + a);
            int a = 1;
            int b = 1000;
            System.out.println("a = " + a);
        }
        // La linea siguiente provocaria error
        // System.out.println("b = " +b)
        int a = 0;
        System.out.println("a = " + ++a);
        {
            System.out.println("a = " + ++a);
            {
                System.out.println("a = " + ++a);
            }
        }   
        System.out.println("a = " + ++a);
        {
            byte b = 'c';
            System.out.println(b);
        }
        {
            short b = 'á';
            System.out.println(b);
        }
    }
}
