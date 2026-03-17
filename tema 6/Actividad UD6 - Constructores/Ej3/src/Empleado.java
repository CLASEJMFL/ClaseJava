public class Empleado {
    String nombre;
    double salario;
    int horasSemanales;
    
    public Empleado(String nombre, double salario, int horasSemanales) {
        this.nombre = nombre;
        
        if (salario <= 0) {
            salario = 0;
        } else {
            this.salario = salario;
        }

        if (horasSemanales < 1 || horasSemanales > 40) {
            horasSemanales = 0;
        } else {
             this.horasSemanales = horasSemanales;
        }
    }
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.horasSemanales = 40;

        if (salario < 0) {
            salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.horasSemanales = 40;
        this.salario = 0;
    }

    void mostrarInfo() {
        System.out.println("Empleado "+nombre+" | Salario: "+salario+" € | Horas semanales: "+horasSemanales);
    }

    
}
