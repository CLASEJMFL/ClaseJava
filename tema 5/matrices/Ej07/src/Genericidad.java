public class Genericidad {
    @SuppressWarnings({ "unused", "rawtypes" })
    public static void main(String[] args) throws Exception {
        /*
        Crea un proyecto llamado ArraysActividades y añade las clases adjuntas Genericidad.java y ListaGenerica.java. Ejecuta y prueba el proyecto.
        Añade al contenido del metodo principal main, un ejemplo con un array de elementos del tipo String y otro de la clase Persona. 
        En este último, tendremos que añadir una clase Persona a nuestro proyecto, 
        con as propiedades (nombre como String y edad como int), crear los objetos y añadirlos y extraerlos de la lista.
        */
        ListaGenerica<Integer> listaEnteros = new ListaGenerica<>();
        listaEnteros.añadirElemento(11);
        System.out.printf("Ultimo elmento %d %n", listaEnteros.recuperarUltimoElemento());
        listaEnteros.añadirElemento(99);
        System.out.printf("Ultimo elemento %d %n", listaEnteros.recuperarUltimoElemento());
        ListaGenerica <Character> listaCaracteres = new ListaGenerica<>();
        listaCaracteres.añadirElemento('A');
        System.out.printf("Ultimo elemento %c %n", listaCaracteres.recuperarUltimoElemento());
        listaCaracteres.añadirElemento('Z');
        System.out.printf("Ultimo elemento %c %n", listaCaracteres.recuperarUltimoElemento());
        listaCaracteres.sort();
        listaEnteros.sort();
        // ******************************************************************************************************
        // ******************************************************************************************************
        ListaGenerica <String> listaCadena = new ListaGenerica<>();
        listaCadena.añadirElemento("Hola");
        listaCadena.añadirElemento("Mundo");
        System.out.printf("Ultimo elemento %c %n", listaCadena.recuperarUltimoElemento());
        // ******************************************************************************************************
        // ******************************************************************************************************
        ListaGenerica<Persona> listaPersonas = new ListaGenerica<>();
        Persona p1 = new Persona("Ana", 25);
        listaPersonas.añadirElemento(p1);
        Persona ultimaPersona = listaPersonas.recuperarUltimoElemento();
        System.out.printf("Ultimo elmento nombre edad", listaPersonas.recuperarUltimoElemento());
    }
}
