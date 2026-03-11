public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private String tipo;
    private Detalle detalle;

    // Constructor con Detalle
    public Producto(int idProducto, String nombre, double precio, String tipo, Detalle detalle) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.detalle = detalle;
    }

    // Getters y setters
    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Detalle getDetalle() { return detalle; }
    public void setDetalle(Detalle detalle) { this.detalle = detalle; }

    public void mostrarInfo() {
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInfor'");
    }
}
