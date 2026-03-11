public class ItemPedido {
    private Producto producto;
    private int cantidad;

    public ItemPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public double calcularSubtotal(){
        return producto.getPrecio() * cantidad;
    }
    public void mostrarDetalle() {
        System.out.print("  -" + cantidad + " x ");
        System.out.print(producto.getNombre() + " (ID: " + producto.getIdProducto() + ")");
        System.out.println(" -> Subtotal: $" + String.format("%.2f", calcularSubtotal()));
    }
}
