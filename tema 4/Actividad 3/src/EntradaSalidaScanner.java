import java.util.Scanner;
import java.util.Locale;

public class EntradaSalidaScanner {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        // Creamos un único objeto Scanner asociado a a la entrada estándar (System.in)
        Scanner scanner = new Scanner(System.in);

        // --- 1. Lectura de Tippos Numéricos (Int y double) ---

        System.out.println(" --- Entrada numérica ---");

        // 1.1 Leer un Entero (int)
        System.out.print("Introduce tu edad (entero): ");
        int edad = scanner.nextInt();
        System.out.println("Edad leida: " + edad);

        // ** IMPORTANTE Limpieza del Búfer**
        // nextint() solo consume el númerro, El carácter de nueva linea ('\n')
        // Queda en el búfer. Necesitamos consumirlo antes de usar nextline().
        scanner.nextLine();

        // 1.2 Leer un Decimal (double)
        System.out.print("Introduce tu altura en metros (decimal), e.g., 1.75: ");
        double altura = scanner.nextDouble();
        System.out.println("Altura leída: " + altura);

        //** IMPORTANTE Limpieza del Búfer**
        // Se repite la limpieza ya que nextDouble() tambien deja el '\n' en el búfer.
        scanner.nextLine();

        // --- 2. Lectura de Cadenas de Texto ---
        System.out.println("\n--- Entrada de texto ---");

        //2.1 Leer una sola palabra (String)
        System.out.print("Introduce tu color favorito (una sola palabra): ");
        String color = scanner.next();
        System.out.println("Color leído: " + color);

        //** IMPORTANTE Limpieza del Búfer**
        // next() solo consume la palabra. Cualquier espacio o '\n' queda en el búfer.
        scanner.nextLine();

        // 2.2 Leer una linea completa (String)
        System.out.print("Introduce una frase que te guste (linea coimpleta): ");
        // nextLine() lee todo hasta el siguiente '\n', por eso es esencial limpiar el búfer antes.
        String frase = scanner.nextLine();
        System.out.println("Frase leída: " + frase);

        // -- 3. Resultados Finales ---

        System.out.println("\n*** Resumen de la informacion recogida***");
        System.out.println("~ Edad " + edad + " años");
        System.out.println("~ Altura: " + altura + " metros");
        System.out.println("~ Color: " + color );
        System.out.println("~ Frase: \"" +  frase + "\"");

        // Cerramos el objeto Scanner para liberar los recuersos del sistema
        scanner.close();
    }
}