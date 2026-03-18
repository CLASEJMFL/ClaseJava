// Estudiante.java

// 1. Sentencia package
package com.ejemplo.escuela;

//2. Sentencia import
import java.util.Date;

// Importamos una clase apra usarla en la nueva clase no publica
import java.util.ArrayList;



public class Estudiante {
    // campos de la clase
    private String nombre;
    private Date fechaInscripcion;
    // Uso del enumerado no publico
    private EstadoEstudiante estado;
    private ArrayList<NotaEstudiante> notas;


    // COnstructor
    public Estudiante(String nombre, Date fechaInscripcion, EstadoEstudiante estado) {
        this.nombre = nombre;
        this.fechaInscripcion = fechaInscripcion;
        this.estado = EstadoEstudiante.ACTIVO;
        this.notas = new ArrayList<>();
    }

    public void añadirNota(String asunto, double puntuacion) {
        notas.add(new NotaEstudiante(asunto, puntuacion));
    }

    // Metodo getter y setter
    public EstadoEstudiante getEstado() {
        return estado;
    }

    public EstadoEstudiante setEstado(EstadoEstudiante estado) {
        return estado;
    }

    public void mostrarDatos() {
        System.out.println("--- DATOS DEL ESTUDIANTE ---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Inscrito el: "+fechaInscripcion);
        System.out.println("Estado: "+estado);
        System.out.println("NOTAS");
        for (NotaEstudiante nota : notas) {
            System.out.println(" "+ nota);
        }
        System.out.println("-----------------------------");
    }
}
enum EstadoEstudiante {
    ACTIVO,
    INACTIVO,
    GRADUADO;
}

class NotaEstudiante {
    private String asunto;
    private double puntuacion;

    public NotaEstudiante(String asunto, double puntuacion) {
        this.asunto = asunto;
        this.puntuacion = puntuacion;
    }
    @Override
    public String toString() {
        return "Asunto: "+asunto+", Puntuacion: "+puntuacion;
    }
}

