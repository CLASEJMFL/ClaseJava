public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Gestion de inventario y pedidos ---");
        // 1. Creacion de objetos (Composicion y Agregación)

        //Crear Detalle (Composición)
        Detalle detalleCamiseta = new Detalle("Azul","L",250.0);
        Detalle detalleLaptop = new Detalle("Gris Espacial","15 pulgadas",1500.0);

        // Crear Productos (Contienen Detalle por Composicion)
        Producto p1 = new Producto(101,"Camiseta Básica",19.99,"Ropa", detalleCamiseta);
        Producto p2 = new Producto(205,"Laptop Pro",1250.00,"Electronica",detalleLaptop);
        System.out.println("\n --- Productos en el Inventario");
        p1.mostrarInfo();
        System.out.println("------------------");
        p2.mostrarInfo();

        // Crear cliente (Agregación)
        Cliente c1 = new Cliente(50,"Marta Ríos","marta.rios@mail.com");

        // 2. Creacion  de Items y Pedidos

        // Crear Items (agregacion: asocian Producto y cantidad)
        ItemPedido item1 = new ItemPedido(p1,3); // 3 camisetas
        ItemPedido item2 = new ItemPedido(p2,1); // 1 laptop

        // Crear pedido
        Pedido pedidoCLiente1 = new Pedido(1,c1, "2025-10-24");

        // Agregar Items al pedido
        pedidoCLiente1.agregarItem(item1);
        pedidoCLiente1.agregarItem(item2);

        // 3. mostrar resumen del pedido
        pedidoCLiente1.mostrarResumen();

        System.out.println("--- Fin del proyecto ---");
    }
}
