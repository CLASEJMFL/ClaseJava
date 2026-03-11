import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java para calcular datos estadísticos de las edades de los alumnos de un
        centro educativo. Se introducirán datos por teclado hasta que uno sea negativo.
        El programa registrará la suma de todas las edades introducidas, la media, el número de alumnos
        y cuántos son mayores de edad.
        */
        
        // Variables
        Scanner sc = new Scanner(System.in);
        int suma = 0, alumnos = 0, edad;

        // Programa
        do {
            System.out.println("Dame la edad del alumno");
            edad = sc.nextInt();
            suma = suma + edad;
            alumnos++;
        } while (edad > 0);

        // Salida
        System.out.println("Todas las edades suman = " + suma);
        System.out.println("La edad media es = " + suma / alumnos );
        System.out.println("Hay un total de " + alumnos + " alumnos");
        sc.close();
    }
}
