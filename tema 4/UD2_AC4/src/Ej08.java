import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        /*
        Pide al usuario dos cadenas de texto y una opción:
            Concatenar ambas cadenas.
            Compararlas.
            Mostrar la longitud de cada una.
            Usa un switch expression y muestra un mensaje descriptivo del resultado.
            (Ejemplo de mensaje descriptivo: “La concatenación de las dos cadenas es: ...”, “Las cadenas son iguales”, “La primera cadena tiene X caracteres y la segunda Y”).

        */

        // Variables
        String cad1, cad2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        cad1 = sc.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        cad2 = sc.nextLine();
        System.out.println("Elige una opción:");
        System.out.println("1. Concatenar ambas cadenas");
        System.out.println("2. Compararlas");
        System.out.println("3. Mostrar la longitud de cada una");
        int opcion = sc.nextInt();

        // Programa
        
        String resultado = switch (opcion) {
            case 1 -> "La concatenación de las dos cadenas es: " + cad1 + cad2;
            case 2 -> cad1.equals(cad2)
                        ? "Las cadenas son iguales"
                        : "Las cadenas son diferentes";
            case 3 -> "La primera cadena tiene " + cad1.length() + " caracteres y la segunda tiene " + cad2.length();
            default -> "Opción no válida";
        };

    // Salida
    System.out.println(resultado);
    sc.close();
    }
}
