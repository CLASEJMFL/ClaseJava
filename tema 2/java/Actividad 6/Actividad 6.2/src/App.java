import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var Articulo = new Articulo("El poder"
                        ,new Autor("Gonzalo","Moreno Prieto")
                        ,LocalDate.of(2025
                                        ,10
                                        ,22)
                        ,new Categoria("Publicidad")
        );
    }
}