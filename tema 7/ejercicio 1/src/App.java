import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        String meter;
        String lugar;
        LocalDateTime fechaInicio = LocalDateTime.now();

        System.out.println("Creamos un texto con la longitud maxima de 5 caracteres");

        // Creamos la adena y añadimos los primeros datos
        meter = "HO";
        lugar = "inicio";
        Cadena miCadena = new Cadena(meter, meter.length(), fechaInicio, LocalDateTime.now(), lugar);

        // Vamos añadiendo despues los cambios
        miCadena.setAñade(";");
        miCadena.setLugar("inicio");
        miCadena.setUltimaModificacion(LocalDateTime.now());
        miCadena.ejercicio();

        miCadena.setAñade("Lá");
        miCadena.setLugar("final");
        miCadena.setUltimaModificacion(LocalDateTime.now());
        miCadena.ejercicio();

        miCadena.setAñade("x");
        miCadena.setLugar("inicio");
        miCadena.setUltimaModificacion(LocalDateTime.now());
        miCadena.ejercicio();

        // Mostrar info final
        miCadena.mostrarInfo();

    }
}
