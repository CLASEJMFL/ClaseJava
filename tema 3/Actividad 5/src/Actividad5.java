public class Actividad5 {
    public static void main(String[] args) {
        // 1. double a int (Explícita : double -> int)
        double valorAlto = 9.99;
        int valorTrucado = (int) valorAlto; // Se requiere (int)

        System.out.println("double (" + valorAlto + ") a int: " + valorTrucado);
        // Observar la pérdida de la parte decimal (Truncamiento)

        // 2. int a byte (Explícita: int -> byte)
        int numGrande = 128;
        byte numPequeno = (byte) numGrande; // Se requiere (byte)

        System.out.println("int (" + numGrande + ") a byte: " + numPequeno);
        // Pregunta: ¿Por qué el resultado es -126? (Explicar desbordamiento/overflow)
    }
}
