public class Persona<T> {
    private final T[] nombre;
    private int edad;

    @SuppressWarnings("unchecked")
    public Persona(String string, int i) {
        nombre = (T[]) new Object[10];
        edad = 1;
    }
    
    public void añadirElemento(T elemento) {
        nombre[edad++] = elemento;
    }

    public T recuperarUltimoElemento() {
        return (nombre[edad-1]);
    }

    public T[] getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
