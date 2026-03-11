public class Ej03 {
    public static void main(String[] args) throws Exception {
        /*
        Escribe un programa en Java que recorra los números del 1 al 40 utilizando un bucle for y muestre
        un texto especial cuando el número cumpla alguna de las siguientes condiciones. 
        
        Se debe mostrar solo la primera palabra correspondiente, aunque el número sea múltiplo de varios valores.
        Para conseguirlo, no podrás usar else ni else if, sino únicamente sentencias if combinadas con
        salidas anticipadas mediante continue.
        Las reglas son estas (se aplicará únicamente la primera condición verdadera en cada número):
            • si el número es múltiplo de 4: muestra “ZAS!” y pasa al siguiente número.
            • si el número es múltiplo de 6: muestra “BOOM!” y pasa al siguiente número.
            • si el número es múltiplo de 9: muestra “CRASH!” y pasa al siguiente número.
            • en cualquier otro caso: muestra el número.
        */
       for (int i=1; i < 40; i++) {
        if (i%4 == 0) System.out.println("ZAS");
        if (i%6 == 0) System.out.println("Boom");
        if (i%9 == 0) System.out.println("CRASH!");
        if (i%4 != 0 && i%4 != 6 && i%9 != 0) System.out.println(i);
       }
    }
}
