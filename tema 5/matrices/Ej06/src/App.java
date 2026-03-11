import java.util.Arrays;
import java.util.Scanner;

public class App {
    /*
    Desarrolla un programa que pida por consola el número de alumnos de una clase y que, 
    a continuación, solicite los N nombres paro almacenarlos en un array.

    Luego, implementa los métodos necesarios para eliminar3 un determinado alumno del array 
    a partir de su nombre, otro para añadir un alumno nuevo al array de alumnos y otro para ordenar el listado de alumnos.
    */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduce el numero de almunos que tienes: "); // pedimos cuantos alumnos tiene
        int num = sc.nextInt();
        
        String[] alumnos = new String[num];
        sc.nextLine();

        for (int i = 0;i < num;i++) {
            System.out.println("Dame el nombre del alumno " + (i+1)); //Pedimos el nombre de los alumnos segun los que metimos antes
            alumnos[i]=sc.nextLine();
        }
        System.out.println();
        System.out.println("Array sin ordenar");
        System.out.println(Arrays.toString(alumnos)); //Sacamos la primera parte que son los alumnos sin ordenar
        sc.close();
        // ***********************************************************************************************
        // METODOS
        // Nuevo alumno
        alumnos = anadirAlumno(alumnos, "Juan"); //Vamos a agregar a Juan como usuario nuevo
        System.out.println();
        System.out.println("Array con alumno extra");
        System.out.println(Arrays.toString(alumnos));
        System.out.println();

        // Eliminar alumno 
        alumnos = eliminarAlumno(alumnos, "Juan"); // Ya que lo agregamos antes ahora vamos a eliminarlo
        System.out.println("Array con alumno Eliminado");
        System.out.println(Arrays.toString(alumnos));
    }


    public static String[] anadirAlumno(String[] alumnos, String nuevoAlumno) {
        String[] nuevoArray = new String[alumnos.length + 1]; // Creamos un array nuevo en el que le añadamos 1 hueco mas para el alumno nuevo

        for (int i = 0; i < alumnos.length; i++) { // Copiamos lo que tiene el array antiguo al nuevo
            nuevoArray[i] = alumnos[i];
        }

        nuevoArray[nuevoArray.length-1] = nuevoAlumno;
        return nuevoArray;
    }


    public static String [] eliminarAlumno(String[] alumnos, String alumnoeliminado) {
         int posicion = -1;

        // Buscar alumno que queremos eliminar
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equalsIgnoreCase(alumnoeliminado)) { //En caso de que en la posicion i sea el usuario que queremos borrar nos lo guardara en la posicion 
                posicion = i;
                break;
            }
        }

        String[] nuevoArray = new String[alumnos.length - 1];
        int j = 0;

        // Eliminamos el usuario (copiamos todo el array menos el que queremos que se quede fuera)
        for (int i = 0; i < alumnos.length; i++) {
            if (i != posicion) { // En caso de que sea correcto es decir que la posicion en la que estamos no sea la posicion donde detectamos a juan pues añadirimos al nuevo si no saltaria
                nuevoArray[j] = alumnos[i];
                j++;
            }
        }
        return nuevoArray;
    }
}