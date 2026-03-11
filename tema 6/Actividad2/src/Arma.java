public class Arma {
    String nombre;
    int puntosDanio;
    int durabilidad = 100;

    

    public Arma(String nombre, int puntosDanio, int durabilidad) {
        this.nombre = nombre;
        this.puntosDanio = puntosDanio;
        this.durabilidad = durabilidad;
    }



    public void mostrarInfo() {
        System.out.println("--------------------------------------");
        System.out.println("     Nombre: "+nombre);
        System.out.println("       Daño: "+puntosDanio);
        System.out.println("Durabilidad: "+durabilidad);
        System.out.println();

    }

    public void mostrarNombre() {
        System.out.println(nombre);
    }


}


