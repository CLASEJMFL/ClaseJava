import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que pida 6 notas de alumnos, y al final nos diga cuántos están aprobados,
        cuántos suspensos y cuántos con un 4.
        */

         int num, aprobados = 0, suspensos = 0, cuatros = 0;
        Scanner sc = new Scanner(System.in);

        // Programa
        for (int i = 1; i < 6; i++) {
            System.out.println("Dame un numero");
            num = sc.nextInt();
            if (num < 5) {
                suspensos++;
            } else if  (num == 4) {
                cuatros++;
            } else {
                aprobados++;
            }
        }
        System.out.println("De los 6 alumnos " + suspensos + " suspendieron , de los cuales " + cuatros + " sacaron un 4  y " + aprobados + " aprobaron");
        sc.close();
    }
}
