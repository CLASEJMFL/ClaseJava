public class Empleado {
    String nombre;
    double salario;
    int horasSemanales;
    public Empleado(String nombre, double salario, int horasSemanales) {
        this.nombre = nombre;

        if (salario < 0) {
            this.salario = 0;
        } else {
            salario = this.salario;
        }

        if (horasSemanales >= 1 && horasSemanales <= 40) {
            horasSemanales = this.horasSemanales;
        } else {
            horasSemanales = 0;
        }
    }

    void mostrarInfo() {
        System.out.println("Empleado "+nombre+" con el salario "+salario+" y con "+horasSemanales+" horas semanales");
    }

    
}
