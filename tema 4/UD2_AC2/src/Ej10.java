import java.util.Scanner;

public class Ej10 {
    public void ej10() {
    // Variables
    Boolean conectado = true;
    Boolean autorizado = false;
    Boolean esAdmin = true;

    // Terminamos las condiciones simples
   if ((conectado == true) && (autorizado == false) && (esAdmin == false)) {
    System.out.println(" Acceso restringido");
   }

    }
}