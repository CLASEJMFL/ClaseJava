public class Ej4 {
    public static void main(String[] args) throws Exception {
        ReservaCine r1 = new ReservaCine("Ana", "Intelestelar", "Viernes", 20,3);
        ReservaCine r2 = new ReservaCine("Luis", "Avatar", "Sabado", 25, -2);
        ReservaCine r3 = new ReservaCine("Marta", "Dune", "Domingo", 18);
        
        System.out.println();
        r1.mostrarInfo();
        r2.mostrarInfo();
        r3.mostrarInfo();

    }
}
