public class Gestores {
    public String nombre;
    final int telefono;
    private int importeMaximo;

    public Gestores(String nombre, int telefono, int importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    public Gestores(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    void mostrarInfoGestor() {
        System.out.println("Gestor: "+nombre);
        System.out.println("Telefono: "+telefono);
        System.out.println("Importe maximo: "+importeMaximo);
    }    

    String sacarNombreGestor() {
        return nombre;
    }
}
