import java.io.Console;

public class Consola {
    public static void main(String[] args) throws Exception {
        // 1. Obtener la instancia de console
        // Observa que no se instancia con new
        Console console = System.console();

        // Verificar si la consola esta disponible
        if (console == null) {
            System.err.println("¡Error! La clase consola no esta disponible");
            System.err.println("Este programa debe ejecutarse desde" +  
                                            "la terminal o línea de comandos (Cmd/Bash)");
            return;
        }
        System.out.println("--- Entrada de Datos con Console ---");

        // --- 1. Lectura de texto (String)
        // console.readline() lee una linea de texto
        String nombre = console.readLine("Introduce tu nombre: ");
        System.out.println("Hola " + nombre + ".");

        // --- 2. Lectura de tipos numéricos (requiere Conversion)

        // 2.1. Leer un entero (int)
        String inputEdad = console.readLine("Introduce tu edad: ");
        int edad = 0;
        try {
            // Conversion debemos parsear la cadena a un entero
            edad = Integer.parseInt(inputEdad);
            System.out.println("Edad leida y convertida: " + edad);
        } catch  (NumberFormatException e) {
            System.err.println("¡Error! La altura introduccion no " + 
                                            "es un decimal válido. Se usará 0.0");
        }

        // --- 3. Lectura de Contraseñas (Password, Opcional) ---
        // readPassword() no muestra los caracteres en pantalla.
        char[] password = console.readPassword("Introduce tu contraseña (no se muestra): ");
        // Por seguridad, convertimos el char[] a String solo para imprimir aqui.
        // En codigo real, usa el array de chbar para comparacion y limpialo despues
        System.out.println("Contraseña ingresada: " + new String(password).replaceAll(".","*"));
    }
}