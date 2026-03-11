public class AnalisisSecuencias {
    public static void main(String[] args) throws Exception {
        // Paso 1: Definición de la cadena usando secuencias de escape
        //Nota : '\n', '\t', '\"', '\\' son secuencias de escape y representan UN SOLO carácter.
        String reporte = "Título del Reporte:\n\t\"Ventas del Mes\"\\Enero";
        System.out.println("--- Reporte Formateado ---");
        System.out.println(reporte);
        System.out.println("--------------------------");

        // Paso 2: Análisis de la longitud de la cadena

        // a) Longitud total (cuenta cada secuencia de escape como 1)
        int longitudTotal = reporte.length();
        System.out.println("1. Longitud TOTAL del String: " + longitudTotal);
        
        // b) Detección de la secuencia de nueva línea ('\n')
        // charAt() accede el caracter en la posicion (la secuencia cuenta como 1)
        int posicionSaltoLinea = reporte.indexOf('\n');
        char caracterEnPosicion = reporte.charAt(posicionSaltoLinea);
       
        System.out.println("2. La secuencia de escape '\\n' se encuentra en el índice: " + posicionSaltoLinea);
        System.out.println("3. El caracter real en esa posición es: " + (int)caracterEnPosicion + " (valor ASCII/Unicode)");
        
        // Paso 3: Extracción de datos usando el salto de linea como delimitado
        String[] partes = reporte.split("\n");

        System.out.println("\n--- Extracción y Conteo ---");
        System.out.println("4. Número de líneas separadas por '\\n': " + partes.length);
        System.out.println("5. Contenido de la pruimera línea: " + partes[0]);
        System.out.println("6. Contenido de la segunda línea (incluye '\\t y \"''): " + partes[1]);
        
        // Eliminar tabulaciones de la segunda linea
        String segundaLineaLimpia = partes[1].replace("\t", "").replace("\"","");
        System.out.println("7. Segunda línea LIMPIA (sin \\t ni \"): " + segundaLineaLimpia);
    }
}
