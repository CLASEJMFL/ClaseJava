public class Ej5 {
    public static void main(String[] args) throws Exception {
        CuentaUsuario u1 = new CuentaUsuario("ana23", "ana@email.com",25,true);
        CuentaUsuario u2 = new CuentaUsuario("carlos", "carlosmail.com",16,true);
        CuentaUsuario u3 = new CuentaUsuario("marta", "marta@email.com");
        System.out.println();
        u1.obtenerResumen();
        u2.obtenerResumen();
        u3.obtenerResumen();

    }
}
