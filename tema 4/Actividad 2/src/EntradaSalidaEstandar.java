import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EntradaSalidaEstandar {
    
    // Limpiamos el buffer de entrada
    public static void limpiarBuffer() throws IOException {
        int caracter;
        // Lee y descarga caracteres hasta que encuenta el carácter de nueva linea ('\n')
        // o hasta que el flujo de entrada termina (-1).
        while ((caracter = System.in.read()) != '\n' && caracter != -1) {
            // No hacemso nada con el byte el byte leído. simplemente lo consumimos.
            // En sistemas con windows, el 'Enter' genera un cr/lf (13, 10)
            // Esto comsumirá el CR y el bucle terminará con el LF
        }
    }
    public static void main(String[] args) throws Exception {
        int c1, c2, c3;

        // 1. Crear un array de bytes para almacenar los datos leídos
        byte[] datos = new byte[10];
        int bytesLeidos = 0;
        // final String CHARSET_USADO = "UTF-8"; // Especificamos el charset
        try{
            System.out.println("Introduzca 3 caracteres: ");
            c1= System.in.read();
            c2= System.in.read();
            c3= System.in.read();

            System.out.write(c1);
            System.out.print((char)c2);
            System.out.println((char)c3);

            limpiarBuffer();

            System.out.println("Por favor, introduce una línea (maximo 3 caracteres): ");
            // 2. Llamar a system.in.read(datos)
            // Esto intenta leer hasta datos.lenght bytes y devuelve el número de bytes leídos
            // Restamos 2 para omitir los caracteres de nueva linea (CRLF)
            String entrada = new String(datos, 0, bytesLeidos);

            // 4. Imprimir el resultado
            System.out.println("Has escrito: " + entrada);
            System.out.println("Número de bytes leídos (Incluyendo enter): " + bytesLeidos);
             } catch(UnsupportedEncodingException error) {
                // Maneja su el charset expecificado no es compatible con el sistema
                // System.err.prinln
                System.err.println("El charset no es compatible: " + error.getMessage());
             } catch(IOException error) {
                System.out.println(System.err);
                System.out.println("Ocurrió un error de entrada/salida: " + error.getMessage());
             }
    }
}
