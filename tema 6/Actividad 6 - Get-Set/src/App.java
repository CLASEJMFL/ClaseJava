import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Pedimos informacion para crear al usuario que vamos a añadir
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Creando cuenta -----");
        System.out.println("Deme su DNI");
        String DNI = sc.nextLine();
        System.out.println("Deme su nombre");
        String nombreTitular = sc.nextLine();

        // Agregamos al usuario
        Gestores g1 = new Gestores("Paco", 123456789);
        g1.mostrarInfoGestor();
        CuentaCorriente p1 = new CuentaCorriente(DNI, nombreTitular, 0,g1.sacarNombreGestor());
        // Monstramos al usuario
        p1.mostrarInfo();

        // Mostramos el menu de lo que puede hace el usuario
        do {
            System.out.println("----- MENU -----");
            System.out.println("1.Sacar dinero");
            System.out.println("2.Guardar dinero");
            System.out.println("3.Mostrar informacion de la cuenta");
            System.out.println("4.Salir");
            int opcion = sc.nextInt();
            System.out.println("=============================");
            if (opcion == 1) {
                System.out.println("Cuanto dinero quiere sacar");
                int sacar = sc.nextInt();
                if (sacar > p1.saldo) {
                    System.out.println("Usted a sacado: "+p1.saldo);
                    p1.saldo = 0;
                    System.out.println("Le quedan: v"+p1.saldo+" en su cuenta");

                } else {
                    p1.saldo = p1.saldo -sacar;
                    System.out.println("Usted a sacado: "+sacar);
                    System.out.println("Le quedan: "+p1.saldo+"€ en su cuenta");
                }
            } else if (opcion == 2) {
                System.out.println("Cuanto dinero quiere guardar");
                int guardar = sc.nextInt();
                p1.saldo = p1.saldo + guardar;
            } else if (opcion == 3) {
                p1.mostrarInfo();
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("Esa opcion no existe volviendo al menu");
            }
                System.out.println("=============================");
        } while (true);
        sc.close();
    }
}