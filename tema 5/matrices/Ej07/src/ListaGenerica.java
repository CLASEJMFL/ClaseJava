public class ListaGenerica <T> {
    private final T[] lista;
    private int posicion;

    @SuppressWarnings("unchecked")
    public ListaGenerica() {
        lista = (T[]) new Object[10];
        posicion = 0;
    }

    public void añadirElemento(T elemento) {
        lista[posicion++] = elemento;
    }

    public T recuperarUltimoElemento() {
        return (lista[posicion-1]);
    }

    public void sort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
