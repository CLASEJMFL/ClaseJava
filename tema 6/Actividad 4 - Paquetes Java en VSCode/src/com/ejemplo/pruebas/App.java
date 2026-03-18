package com.ejemplo.pruebas;

import com.ejemplo.escuela.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Intentando crear un estudiante...");

        Estudiante est1 = new Estudiante("Juan Perez",new java.util.Date(), null);
        est1.añadirNota("Matematicas",8.5);
        est1.añadirNota("Historia",9.2);
        est1.mostrarDatos();

        System.out.println("\n--- Provando visivilidad desde otro paquete ---");

        System.out.println("Las pruebas de acceso directo a tipos no publicos "+ "(enum y clase) fallaron como se esperaba ");
        System.out.println("Solo la clase pública 'Estudiante' y sus métodos " + "públicos son accesibles");
        
    }
}
