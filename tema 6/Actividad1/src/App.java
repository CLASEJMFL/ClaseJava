public class App {
    public static void main(String[] args) throws Exception {
        Coche c1 = new Coche("Toyota","Corola",100,false);
        c1.mostrarInfo();
        c1.viajar(96);
        c1.mostrarInfo();
    }
}