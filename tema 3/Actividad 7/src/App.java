public class App {
    public static void main(String[] args) throws Exception {
        String sNumeroEntero = "42";
        String sNumeroDecimal = "3.14";

        try {
            // De String a int
            int numeroInt = Integer.parseInt(sNumeroEntero);

            // De String a double
            double numeroDouble = Double.parseDouble(sNumeroDecimal);

            // **¡Error!**
            String sInvalido = "Hola";
            int error = Integer.parseInt(sInvalido); // Esto causará una NumberFormatatException

            System.out.println("la variable error genera un error" + error);
        } catch (NumberFormatException e) {
            System.err.println("\n ¡Error de conversión! La cadena no es un número válido.");
            System.err.println("Mensaje de error: " + e.getMessage());
        }
    }
}
