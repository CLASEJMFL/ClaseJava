public class App {
    public static void main(String[] args) throws Exception {
       
        // Ejercicio 1 = false
            boolean var = true && false;
            System.out.println("Ejercicio1: " + var);

        // Ejercicio 2 = false
            var = !true || false;
            System.out.println("Ejercicio2: " +var);

        // Ejercicio 3 = false
            int edad = 20;
            boolean carnet = true;
            int nota = 6; boolean asistencia = false;
            System.out.println("Ejercicio3: " + ((nota >=5) && (asistencia == true)));
        // Ejercicio 4 = true
            nota = 6; asistencia = false;
            System.out.println("Ejercicio4: " + ((nota >= 5) && (asistencia == true)));

        // Ejercicio 5 = true
            int temperatura = 30; 
            boolean llueve = false;
            System.out.println("Ejercicio5: " + !(temperatura > 25 && llueve));

        // Ejercicio 6 = true
            edad = 16; 
            boolean permisoPadres = true;
            System.out.println("Ejercicio6: " + (!(edad >= 18) && permisoPadres));

        // Ejercicio 7 = true
            int puntos = 45; 
            boolean extra = true;
            System.out.println("Ejercicio7: " + ((puntos >= 50) || (puntos >= 40 && extra)));

        // Ejercicio 8 = true
            int hora = 21; 
            boolean invitado = false;
            System.out.println("Ejercicio8: " + ((hora >= 18 && hora <= 23) && !invitado));

        // Ejercicio 9 = true
             puntos = 38; 
            extra = true; 
            boolean penalizacion = false;
            System.out.println("Ejercicio9: " + ((puntos >= 40 && extra) || (puntos >= 35 && !penalizacion)));

        // Ejercicio 10 = false
            hora = 20; 
            invitado = true; 
            boolean accesoVIP = false;
            System.out.println("Ejercicio10: " + ((hora >= 18 && hora <= 23) && (!invitado || accesoVIP)));

        // Ejercicio 11 = true
            edad = 22; 
            carnet = true; 
            boolean antecedentes = false;
            System.out.println("Ejercicio11: " + ((edad >= 18 && carnet) && !antecedentes));

        // Ejercicio 12 = true
            int temp = 15; 
            boolean lluvia = true; 
            boolean abrigo = false;
            System.out.println("Ejercicio12: " + ((temp < 20 && lluvia) || abrigo));

        // Ejercicio 13 = true
            boolean tieneClave = true; 
            boolean biometría = false; 
            boolean admin = true;
            System.err.println("Ejercicio13: " + (tieneClave && (biometría || admin)));

        // Ejercicio 14 = false
            edad = 17; 
            boolean padrePresente = true; 
            boolean permisoEspecial = false;
            System.out.println("Ejercicio14: " + ((edad >= 18) || (padrePresente && permisoEspecial)));

        // Ejercicio 15 = true
            hora = 23;
            boolean fiesta = true;
            boolean vecinoMolesto = false;
            System.out.println("Ejercicio15: " + ((hora >= 22 && fiesta) && !vecinoMolesto));
    }
}