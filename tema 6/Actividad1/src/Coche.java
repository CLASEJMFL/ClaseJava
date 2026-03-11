public class Coche {
    String marca;
    String modelo;
    int combustible = 5;
    boolean reserva = false;


    public Coche(String marca, String modelo, int combustible, boolean reserva) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.reserva = reserva;
    }

    void mostrarInfo() {
        // Comprobamos que el combustible esta en 0 y 100
        if (combustible < 0) {
            combustible = 0;
        } else if (combustible > 100) {
            combustible = 100;
        }

        // Comprobamos que el combustible no tenga la reserva encendida
        if (combustible <= 5) {
            reserva = true;
        } else {
            reserva = false;
        }

        // Sacamos por pantalla 
        System.out.println("--------------------------------------");
        if (reserva == false) {
            System.out.println("Su coche es un " +marca+" "+modelo+" tiene un total de combustible de "+combustible+"%, "+ "reserva esta apagada");
        } else {
            System.out.println("Su coche es un " +marca+" "+modelo+" tiene un total de combustible de "+combustible+"%,"+ "reserva esta encendida");
        }
        System.out.println();
        System.out.println("--------------------------------------");

    }

    void viajar(int km) {
    // Comprobamos cuando combustible resta
        if (combustible > 5){
            if (combustible > km) {
                combustible = combustible-km;
                System.out.println("A recorrido un total de "+km+" kilometros");
            } else {
                System.out.println("No tiene suficiente combustible para el viaje");
            }
        } else {
            reserva = true;
        }
    }


}
