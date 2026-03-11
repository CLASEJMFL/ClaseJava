public class Cliente {
    
    private int idCliente;
    public int getIdCliente() {
        return idCliente;
    }
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    private String email;
    public Cliente(int idCliente, String nombre, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarInfo() {
        System.out.println("Cliente Id " + idCliente + ": " + nombre + " (" + email + ")");
    }
    
}
