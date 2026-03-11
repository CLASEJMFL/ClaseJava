public class OperadoresJava {
    // Ejercicio 1: Aritméticos y Precedencia ---
    public static int calcularExpresioneCompleja(int x, int y, int z) {
        //Expresion: z + x + y / 2 - (z % x)
        // Orden de evaluación:
        // 1. (z % x) -> 20% 3 = 2
        // 2. x * y -> 3*5 = 15
        // 3. 15/2 = 7
        // 4. z + 7 -> 20 + 7 = 27
        // 5. 27 - 2 = 25
        return z + x * y / 2 - (z % x);
    }
    // --- Ejercicio 2: Unarios y de Asignación ---
    public static int practicarIncremento(int contador) {
        // Demostración de operadores unarios
        int a = contador++;
        int b = --contador;

        System.out.println("  Post-incremento (a): " + a);
        System.out.println("  Pre-decremento(b)): " + b);
        // Operador de Asignación Compuesto: +=
        b+=a; // Es equivalente a: b = b + a (5 + 5 = 10)
        return b; 
    }
    // Ejercicio 3: Relacipones y lógicos ---
    public static boolean verificarCondiciones(double nota, int edad, boolean tieneDescuento) {
        // Condición 1: Relacional y AND lógico (&&)
        //Precedencia: > (Nivel 5) se evalúa antes que && (Nivel 11)
        boolean esBuenEstudiante = nota >= 7.0 && edad < 25;
        
        // Condicion 2: NOT lógico (!) y OR lógico (||)
        // Precedencia: ! (Nivel 2) se evalúa antes que || (nivel 12)
        boolean puedeAplicar = esBuenEstudiante || !tieneDescuento;
        System.out.println( " Es buen estudiante (>7.0 y <25): " + esBuenEstudiante);
        System.out.println(" No tiene descuento (!): " + !tieneDescuento);
        return puedeAplicar;
    }

    public static void main(String[] args) throws Exception {
        // Valores de prueba 
        int X = 3;
        int Y = 5;
        int Z = 20;

        // --- Ejecución 1: Aritméticos y Precedencia ---
        System.out.println("");
        System.out.println("==== 1. Aritméticos y precedencia ====");
        int resultadoAritmetico = calcularExpresioneCompleja(X, Y, Z);
        System.out.println("La expresión " + Z + " + " + X + " * " + Y + " / 2 - (" + Z + " % " + X + ")");
        System.out.println("Resultado (Esperado: 25): "  + resultadoAritmetico);
        System.out.println("-----------------------------");
        // --- Ejecución 2: Unarios de Asignación ---
        System.out.println("==== 2. UNARIOS Y ASIGNACIÓN ====");
        int contadorInicial = 5;
        System.out.println("Valor inicial del contador: " + contadorInicial);
        int resultadoUnario = practicarIncremento(contadorInicial);
        System.out.println("Resultado final de la práctica (Esperando: 10): " + resultadoUnario);
        System.out.println("-----------------");

        // Ejecución 3: Relacionales y Lógicos
        System.out.println("==== 3. RELACIONALES Y LÓGICOS =======");
        double notaAlumno = 8.0;
        int edadAlumno = 20;
        boolean tieneDescuento = true;

        boolean puedeAplicar = verificarCondiciones(notaAlumno, edadAlumno, tieneDescuento);
        System.out.println("Nota: " + notaAlumno + ", Edad: " + edadAlumno + ", Descuento: " + puedeAplicar);
        System.out.println("Resultado final de 'puedeAplicar' (Esperando: false): " + puedeAplicar);
        System.out.println("--------------------------\n");
        
    }
}
