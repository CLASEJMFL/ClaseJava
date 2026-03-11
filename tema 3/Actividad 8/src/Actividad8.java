public class Actividad8 {
    public static void main(String[] args) throws Exception {
        // ¿Hay algún método que permita saber si un dato es o no un número?
        // No hay un metodo como tal en java pero se puede hacer un script que devuelva si es entero o  double
        /*
            public static boolean esNumero(String s) {
            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
                }
            }
        */
        // ¿Hay algún método que permita obtener un entero a partir de un decimal?
        // Si, la conversion del numero de double(decimal) a int(Entero)
        /*
            double d = 5.87;
            int i = (int) d; // Resultado: 5

         */
        // ¿Hay algún método que retorne un objeto de clase envoltorio a partir del valor que represente un literal?
        // Si, las clases envoltorios.
        /*
            Integer i = Integer.valueOf("123");
            Double d = Double.valueOf("45.67");
            Boolean b = Boolean.valueOf("true");

         */
    }
}
