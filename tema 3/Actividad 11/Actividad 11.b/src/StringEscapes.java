public class StringEscapes {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1: Formateo de una dirección
        String direccion = "Calle Mayor No. 5\tZona Centro";
        System.out.println("Dirección:\n" + direccion);

        // Ejercicio 2: Cita textual
        String cita = "El profesor dijo: \"Recuerden usar '\\n' para saltos de línea";
        System.out.println("\nCita:\n" + cita);

        // Ejercicio 3: Ruta de archivo (necesita doble barra invertida)
        String ruta = "El archivo está en C:\\Proyectos\\ClaseJava\\ejemplo.txt";
        System.out.println("\nRuta de archivo:\n" + ruta);
    }
}
