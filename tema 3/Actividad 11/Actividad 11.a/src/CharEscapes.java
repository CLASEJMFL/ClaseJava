public class CharEscapes {
    public static void main(String[] args) throws Exception {
        // Ejemplo de char con secuencuencia de escape
        char caracterEspecial = '\'';
        System.out.println("El carácter es: " + caracterEspecial); // Salida: '

        // Uso de Unicode para un carácter especial
        char simboloMarca = '\u2122' ; // Código Unicode para el símbolo de marca registrada ("")
        System.out.println("A" + '\t' + "B" + '\n' + "C"); // Salida: ""

        // Demostración de tabulación y nueva línea
        System.out.println("A" + '\t' + "B" + '\n' + "C");
    }
}
