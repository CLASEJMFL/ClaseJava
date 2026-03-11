
/*
Ejercicio Práctico: Utilidades Avanzadas de Arrays
El objetivo de este ejercicio es aplicar los métodos de la clase java.util.Arrays para inicializar, 
manipular y comparar el contenido de arrays de manera eficiente.
*****************************************************************
Parte A: Inicialización y Llenado Masivo (Método Arrays.fill())
*****************************************************************
Crea un programa llamado GestionTareas.
Declara un array de tipo String llamado tareasDia con un tamaño fijo de 7 (representando los 7 días de la semana).
Utiliza el método Arrays.fill() para inicializar de forma masiva todas las posiciones del array con el valor "PENDIENTE".
Luego, utiliza Arrays.fill() de nuevo, pero con un rango de índices, para asignar el valor 
"VACACIONES" solo a los días correspondientes al fin de semana (índices 5 y 6).
Imprime el contenido final del array utilizando el método Arrays.toString() para verificar el resultado.
*/

/*
***********************************************************
Parte B: Comparación de Contenido (Método Arrays.equals())
***********************************************************
Crea un segundo array de tipo int llamado pinSecretoA e inicialízalo masivamente con los valores {8, 4, 2, 0}.
Crea un tercer array de tipo int llamado pinSecretoB e inicialízalo con los mismos valores, pero utilizando 
la palabra clave new (ej: new int[]{8, 4, 2, 0}).
Utiliza el operador de comparación == para comparar pinSecretoA y pinSecretoB. Imprime el resultado y explica brevemente por qué Java muestra ese valor.
Utiliza el método Arrays.equals() para comparar pinSecretoA y pinSecretoB. Imprime el resultado 
y explica por qué en este caso el valor es diferente al obtenido en el paso anterior.
Modifica un solo elemento de pinSecretoB y vuelve a usar Arrays.equals() para demostrar que el método es sensible al contenido y al orden.
Requisitos Clave
El programa debe compilar sin errores.
Debe importarse la clase java.util.Arrays para el uso de sus métodos estáticos.
Se penalizará el uso de bucles for manuales para la inicialización y la impresión de arrays.
*/

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Variables
        String [] tareasDias;
        int pinSecretoA[]= {8,4,2,0};
        int [] pinSecretoB;
        pinSecretoB=new int[]{8,4,2,0};
        tareasDias = new String[7];

        // Primera actividad
        java.util.Arrays.fill(tareasDias,"pendientes");
        java.util.Arrays.fill(tareasDias,5,7,("Vacaciones"));
        System.out.println(Arrays.toString(tareasDias));

        // Segunda actividad
        System.out.println(pinSecretoA == pinSecretoB); // en este caso las variables no solo comparan el contenido si no tambien el formato
        System.out.println(java.util.Arrays.equals(pinSecretoA, pinSecretoB)); // en este caso solo mira el contenido del array
    }
}
