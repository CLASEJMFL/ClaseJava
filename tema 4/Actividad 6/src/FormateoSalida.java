import java.time.LocalDateTime;
import java.util.Date;

public class FormateoSalida {
    public static void main(String[] args)  {
        String nombre = "Luisa";
        int edad = 20;
        char letraGrupo = 's';
        System.out.printf("Hola, %S . Tienes %d años estás en el grupo %C.%n"
                , nombre, edad, letraGrupo);
        double peso = 69.46;
        System.out.printf("Tu peso es: %.2f kg.%n", peso);
        String curso1 = "Primero";
        double puntos1 = 25.999;
        String curso2 =  "Segundo";
        double puntos2 = 35.99;
        System.out.printf("Puntos en %-10s %10.2f%n", curso1, puntos1);
        System.out.printf("Puntos en %-10s %10.2f%n", curso2, puntos2);
        LocalDateTime dt = LocalDateTime.now();
        Date d = new Date();
        System.out.printf("Mensaje mostrado el %1$tA %1$td de %1$tB de %1$tY%n", dt);
        System.out.printf("a las %1$tH:%1$tM:%1$tS %1$tp%n", d);
    }
}
