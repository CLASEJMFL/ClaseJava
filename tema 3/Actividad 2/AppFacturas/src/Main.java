import com.miempresa.modelo.Cliente; //Importamos la calse cleinte
import com.miempresa.modelo.Factura; //Importamos la nueva clase Factura
import com.miempresa.util.CalculadoraImpuestos; // Importamos la clase utileria.

public class Main{
    public static void main(String[] args) {
        // 1. Crear instancias usando clases importadas
        Cliente juan = new Cliente("Juan Pérez");
        double montoBase = 1000.0;
        
        // Crear una factura para juan
        Factura factura = new Factura(juan, montoBase);

        //2. Usar la funcionalidad de otro paquete (com.miempresa.util)
        // Calculamos el IVA usando la clase utilitaria
        double ivaCalculado = CalculadoraImpuestos.calcularIVA(factura.getMontoBase());

        // 3. Actualizar la factura (usando un metodo interno)
        factura.setMontoTotal(ivaCalculado);

        // 4. Mostrar el resultado
        System.out.println("======================");
        System.out.println("     GENERACIÓN DE FACTURA");
        System.out.println("======================");
        System.out.println("Cliente: " + factura.getCliente().getNombre());
        System.out.println("--------------------------");
        System.out.println("Monto Base: " + factura.getMontoBase());
        System.out.println("IVA (16%) " + ivaCalculado);
        System.out.println("----------------");
        System.out.println("TOTAL:     " + factura.getMontoTotal());
    }
}
