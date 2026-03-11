public class App {
    public static void main(String[] args) throws Exception {
        Arma g1 = new Arma("Espada",30,100);
        Arma g2 = new Arma("Pistola",50,20);
        Personaje p1 = new Personaje("Juan", 300, g1);
        Personaje p2 = new Personaje("Pedrito", 100, g2);

        p1.mostrarEstado();
        p2.mostrarEstado();
        int i = 1;
        while (true) {

            p1.salud = p1.salud - g2.puntosDanio;
            p2.salud = p2.salud - g1.puntosDanio;
            System.out.println("------------------------------ TURNO: "+i+" ------------------------------");
            i++;
            System.out.print(p1.nombre+" ataca a "+p2.nombre+" y le hace "+g1.puntosDanio);
            System.out.println(" || La vida de "+p2.nombre+" baja a "+p2.salud);
            System.out.println();
            if (p1.salud <= 0 || p2.salud <= 0){
            System.out.println("======================================================================");
                if (p1.salud <= 0) {
                    System.out.println("              El personaje " +p1.nombre+" a perdido el combate");
                System.out.println("======================================================================");

                    break;
                } else {
                    System.out.println("              El personaje " +p2.nombre+" a perdido el combate");
                System.out.println("======================================================================");

                    break;
                }
            }
            System.out.print(p2.nombre+" ataca a "+p1.nombre+" y le hace "+g2.puntosDanio);
            System.out.println(" || La vida de "+p1.nombre+" baja a "+p1.salud);
            System.out.println("----------------------------------------------------------------------");
        }
        
    }
}
