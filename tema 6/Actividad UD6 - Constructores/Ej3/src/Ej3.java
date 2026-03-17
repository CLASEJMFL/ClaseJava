public class Ej3 {
    public static void main(String[] args) throws Exception {
        Empleado e1 = new Empleado("Ana", 1800, 38);
        Empleado e2 = new Empleado("Luis", 1200);
        Empleado e3 = new Empleado("Marta");

        System.out.println();
        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

    }
}
