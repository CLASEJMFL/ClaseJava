public class App {
    public static void main(String[] args) throws Exception {
    /*
        Declara una variable int llamada totalArticulos con un valor de 3.
        Declara una variable double llamada costeTotal con un valor de 35.75.
        Calcula el coste promedio por artículo (costeTotal / totalArticulos) y almacénalo en una variable double llamada costePromedio.
        Muestra el costePromedio en dos formatos:
            -El valor exacto (como double).
            -El valor entero (redondeado hacia abajo) y almacénalo en una variable int llamada costeEntero.
    */
    // Varibales y operaciones
    int totalArticulos = 3;
    double costeTotal = 35.75;
    double costePromedio = costeTotal / totalArticulos;
    int costeEntero = (int) costePromedio;

    // Outputs
    System.out.print(costePromedio);
    System.out.println();
    System.out.println();
    System.out.println(costeEntero);
    }
}