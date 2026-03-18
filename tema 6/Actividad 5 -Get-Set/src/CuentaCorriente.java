public class CuentaCorriente {
    String DNI;
    String nombreTitular;
    int saldo;
    String nombreBanco;

    public CuentaCorriente(String dNI, String nombreTitular, int saldo,String nombreBanco) {
        DNI = dNI;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.nombreBanco = nombreBanco;
    }
    
    void mostrarInfo() {
        System.out.println("==========================");
        System.out.println("La cuenta con el nombre: "+nombreTitular);
        System.out.println("Con el DNI: "+DNI);
        System.out.println("Su saldo actual es: "+saldo);
        System.out.println("EL nombre de su banco es: "+nombreBanco);
        System.out.println("==========================");
    }
}
