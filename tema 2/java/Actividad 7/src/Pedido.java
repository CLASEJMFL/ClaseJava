import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private List<ItemPedido> items;
    private String fecha;

       
    public Pedido(int idPedido, Cliente cliente, String fecha) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fecha = fecha;
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemPedido item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("\n*** RESUMEN DE PEDIDO ID " + idPedido + " ***");
        System.out.println(" Fecha " + fecha);
        System.out.println("Cliente: ");
        cliente.mostrarInfo();
        System.out.println("\n Detalle de ítems:");
        for (ItemPedido item : items) {
            item.mostrarDetalle();
        }
        System.out.println("\n TOTAL A PAGAR: $" + String.format("%.2f", calcularTotal()));
        System.out.println("***************************");
    }
    
}
