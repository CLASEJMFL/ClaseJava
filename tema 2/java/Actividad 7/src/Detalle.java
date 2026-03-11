public class Detalle {
    private String color;
    private String talla;
    private double pesoGramos;
    
    public Detalle(String color, String talla, double pesoGramos) {
        this.color = color;
        this.talla = talla;
        this.pesoGramos = pesoGramos;
    }
    public void mostrarDetalleFisico() {
        System.out.println("   -Color: " + color);
        System.out.println("   -Talla/Tamaño: " + talla);
        System.out.println("   -Peso: " + pesoGramos + "g");
    }
}
