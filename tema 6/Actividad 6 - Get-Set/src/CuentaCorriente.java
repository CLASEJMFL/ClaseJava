public class CuentaCorriente {
    String DNI;
    String nombreTitular;
    int saldo;
    String gestor;

    public CuentaCorriente(String dNI, String nombreTitular, int saldo,String gestor) {
        DNI = dNI;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.gestor = gestor;
    }
    
    void mostrarInfo() {
        System.out.println("==========================");
        System.out.println("La cuenta con el nombre: "+nombreTitular);
        System.out.println("Con el DNI: "+DNI);
        System.out.println("Su saldo actual es: "+saldo);
        System.out.println("Su gestor es: "+gestor);
        System.out.println("==========================");
    }
}