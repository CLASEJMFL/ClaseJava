public class Ej02 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que, empezando en 0, muestre el cuadrado de los números
        naturales, mientras el cuadrado sea menor que 100.
        */
       
        // Variables
        int num = 0, cuadrado;
        
        // Programa
        do {
            cuadrado = num * num;
            System.out.println("El cuadrado del numero" + num + " es " + (cuadrado));
            num = num+1;
        } while (cuadrado < 100);

    }
}
