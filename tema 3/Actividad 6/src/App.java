public class App {
    public static void main(String[] args) throws Exception {
        int edad = 35;
        double precio = 19.95;

        // Opción 1: Usando String.valueoff() (Recomendada)
        String sEdad = String.valueOf(edad);
        String sPrecio = String.valueOf(precio);

        // Opción 2: Usando concatenación (Rápida, pero menos explícita)

        String sEdadConcatenada = edad + "";

        System.out.println("El precio es: " + sPrecio);
        System.out.println("La edad es: " + sEdadConcatenada);

        System.out.println("Int a String (Tipo: " + sEdad.getClass().getName() + "): " + sEdad);
    }
}
