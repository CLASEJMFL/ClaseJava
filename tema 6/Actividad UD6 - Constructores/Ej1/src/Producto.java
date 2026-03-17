public class Producto {
    String nombre;
    double precio;

    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;

        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    void mostrarInfo() {
        System.out.println(nombre);
        System.out.println(precio);
    }

    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }

    
}
