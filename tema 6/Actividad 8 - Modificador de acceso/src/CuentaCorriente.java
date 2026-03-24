public class CuentaCorriente {
    String DNI;
    public String nombreTitular;
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(String dNI, String nombreTitular, int saldo) {
        this.DNI = dNI;
        this.nombreTitular = nombreTitular;
        setSaldo(saldo);
    }
    
    void mostrarInfo() {
        System.out.println("==========================");
        System.out.println("La cuenta con el nombre: "+nombreTitular);
        System.out.println("Con el DNI: "+DNI);
        System.out.println("Su saldo actual es: "+saldo);
        System.out.println("==========================");
    }
}