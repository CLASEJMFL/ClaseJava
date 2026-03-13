public class App {
    public static void main(String[] args) {
        Aventurero a1 = new Aventurero(0, "Carlos god of fifa");
        GremioAventureros.totalMiembros = GremioAventureros.totalMiembros +1;
        Aventurero a2 = new Aventurero(0, "Torrente");
        GremioAventureros.totalMiembros = GremioAventureros.totalMiembros +1;
        GremioAventureros g = new GremioAventureros();
        int mision;
        g.mostrarEstadoGremio();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println(a1.nombre+" se a unido al gremio");
        System.out.println(a2.nombre+" se a unido al gremio");
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();

        mision = 100;
        System.out.println(a1.nombre+" a completado una mision recibio " +mision);
        a1.oroPersonal = mision-((mision*20)/100);
        g.tesoroGremio = g.tesoroGremio + ((mision*20)/100);
        System.out.println("->Retiene "+(mision-((mision*20)/100))+" para si mismo");
        System.out.println("-->Le paga "+(mision*0.2)+" a las arcas del gremio");
        System.out.println();
        
        mision = 80;
        System.out.println(a2.nombre+" a completado una mision recibio " +mision);
        a2.oroPersonal = mision-((mision*20)/100);
        g.tesoroGremio = g.tesoroGremio + ((mision*20)/100);

        System.out.println("-> Retiene "+(mision-((mision*20)/100))+" para si mismo");
        System.out.println("--> Le paga "+((mision*20)/100)+" a las arcas del gremio");
        System.out.println();
        g.mostrarEstadoGremio();

    }
}