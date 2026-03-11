import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) throws Exception {
       /* 
      Escribe un programa que solicite una fecha (día, mes y año) y verifique si es válida, 
      teniendo en cuenta que el mes debe estar entre 1 y 12, 
      que los meses no tienen todos el mismo número de días y que no existe el año 0.
      No se consideran los años bisiestos.
      Usa un switch expression con yield.
       */

      // Variables
      Scanner sc = new Scanner(System.in);
      int dia, mes, ano;

        System.out.println("Introduce el día: ");
        dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        ano = sc.nextInt();

        // Programa

        int diasDelMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            case 2 -> {
                yield 28; 
            }
            default -> {
                yield -1;  
            }
        };

        // Salida
        if (diasDelMes == -1) {
            System.out.println("La fecha no es válida: el mes debe estar entre 1 y 12.");
        } else if (dia < 1 || dia > diasDelMes) {
            System.out.println("La fecha no es válida: el día no corresponde al mes indicado.");
        } else if (ano == 0) {
            System.out.println("La fecha no es válida: no existe el año 0.");
        
        }  else {
            System.out.println("La fecha es válida.");
        }
    sc.close();
    }
}
