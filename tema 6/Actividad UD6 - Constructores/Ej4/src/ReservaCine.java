public class ReservaCine {
    String cliente;
    String pelicula;
    String dia;
    int hora;
    int entradas;

    public ReservaCine(String cliente, String pelicula, String dia, int hora, int entradas) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.dia = dia;
        
        if (hora >= 10 && hora <=23) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }

        if (entradas > 0) {
            this.entradas = entradas;
        } else {
            this.entradas = 0;
        }
    }

    public ReservaCine(String cliente, String pelicula, String dia, int hora) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.dia = dia;
        this.hora = hora;
        this.entradas = 1;
    }

    void mostrarInfo() {
        System.out.println("Reserva - Cliente: "+cliente+" | Pelicula: "+pelicula+" | Dia: "+dia+" | Hora: "+hora+" | Entradas: "+entradas);
    }

    

    
}
