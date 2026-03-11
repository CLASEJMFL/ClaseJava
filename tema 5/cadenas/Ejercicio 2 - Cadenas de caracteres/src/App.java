import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String idProductoStr;
        String precioBaseStr;
        String cantidadStr;
        String descuentoAplicadoStr = "5.5";

        System.out.print("Digame la id del producto: ");
        idProductoStr = sc.nextLine();
        System.out.print("Digame el precio del objeto: ");
        precioBaseStr = sc.nextLine();
        System.out.print("Digame la cantidad de productos: ");
        cantidadStr = sc.nextLine();
        System.out.print("Digame el descuento que tiene: ");
        descuentoAplicadoStr = sc.nextLine();


        int idProducto = Integer.parseInt(idProductoStr);
        int idPrecioBase = Integer.parseInt(precioBaseStr);
        int cantidad = Integer.parseInt(cantidadStr);
        Float descuentoAplicado = Float.parseFloat(descuentoAplicadoStr);

        Integer Producto = Integer.valueOf(idProducto);
        Integer Precio = Integer.valueOf(idPrecioBase);
        Integer Cantidad = Integer.valueOf(cantidad);
        Float Descuento = Float.valueOf(descuentoAplicado);

        Integer subtotal = (Precio * Cantidad);
        Float totalfinal = (subtotal-(subtotal/Descuento));

        System.out.println("Factura del producto ->> ["+Producto+"]: El total es pagar es de ["+totalfinal+"]");
        sc.close();

    }
}
