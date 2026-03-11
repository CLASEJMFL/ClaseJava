import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] parking = {0,100,0,0,0,102,106,0,0,103,104};
        int [] maestro = {0,100,0,0,0,102,106,0,0,103,104};
        boolean estado=verificarEstadoParking(parking,maestro);

        if (estado == true) { // EN CASO DE TRUE LAS PLZAS DE AMBOS ESTAN BIEN
            System.out.println("El estado de plazas y maestro es el mismo no hay errores");
        } else { // EN CASO DE QUE SEA FALSE LAS PLAZAS ESTARIAN MAL Y POR LO TANTO HACEMOS UNA LIMPIEZA DEL PARKING
            System.out.println("El estado de plazas y maestro no es el mismo");
            estado=protocoloVaciadoUrgente(parking,maestro);
            System.out.print("El parking a sido vaciado = ");
            System.out.println(Arrays.toString(parking));
        }

    }

    private static boolean protocoloVaciadoUrgente(int[] parking, int[] maestro) {
        Arrays.fill(parking, 0); // RELLENAMOS EL ARRAY CON 0 PARA DECIR QUE LOS HUECOS ESTAN VACIOS
        boolean estado = (Arrays.equals(parking, maestro));
        return estado;
    }
    
    // COMPARAMOS LOS 2 ARRAY EN CASO DE QUE SEA VERDAD SACARIA TRUE Y ESTARIA BIEN EN CASO QUE NO SEAN IGUALES SACARIA FALSE
    private static boolean verificarEstadoParking(int[] parking, int[] maestro) {
        boolean estado = (Arrays.equals(parking, maestro));
        return estado;
    }
}