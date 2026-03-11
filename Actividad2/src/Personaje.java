public class Personaje {
    String nombre;
    int salud = 100;
    Arma tipoArma;

    

    public Personaje(String nombre, int salud, Arma tipoArma) {
        this.nombre = nombre;
        this.salud = salud;
        this.tipoArma = tipoArma;
    }



    void mostrarEstado() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("Nombre: "+nombre);
        System.out.println(" Salud: "+salud);
        System.out.print("  Arma: ");
        tipoArma.mostrarNombre();
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
    }

    
}
