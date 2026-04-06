import java.time.LocalDateTime;

public class Cadena {

    private String cadena;
    private String añade;
    private int longitudMaxima;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaModificacion;
    private String lugar;
    private int longitudCadena=0;

    
    
    public Cadena(String cadena, int longitudMaxima, LocalDateTime fechaCreacion, LocalDateTime ultimaModificacion,
            String lugar) {
        this.cadena = cadena;
        this.longitudMaxima = longitudMaxima;
        this.fechaCreacion = fechaCreacion;
        this.ultimaModificacion = ultimaModificacion;
        this.lugar = lugar;
    }

    public String getAñade() {
        return añade;
    }

    public void setAñade(String añade) {
        this.añade = añade;
    }


    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getLugar() {
        return lugar;
    }

   public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // ejercicio se usa para añadir texto a la cadena y comparar en caso de que sea mayor a loq que estamos pidiendo
    public void ejercicio() {
        longitudCadena=longitudCadena + longitudMaxima;
        if (longitudCadena > 5) {
            if (lugar == "final"){
                System.out.println("Intentamos añadir '"+añade+"' al final del texto pero no hay suficiente espacio");
            } else if (lugar == "inicio") {
                System.out.println("Intentamos añadir '"+añade+"' al inicio del texto pero no hay suficiente espacio");
            }
        } else {
            if (lugar == "final"){
                System.out.println("Añadida la cadena '"+añade+"' al final del texto");
                cadena = cadena+añade;  
            } else if (lugar == "inicio") {
                System.out.println("Añadida la cadena '"+añade+"' al inicio del texto");
                cadena = añade+cadena;
            }
        }

    }

    // Mostramos la informacion  de todo incluida hora fecha creacion la cadena y contador de vocales
    public void mostrarInfo(){
        int contadorVocales=0;
        for (int i=0;i<cadena.length();i++){
                char c = cadena.charAt(i);
                if (c == 'a'|| c == 'A'||c == 'e'|| c == 'E'||c == 'i'|| c == 'I'||c == 'o'|| c == 'O'|| c == 'u'|| c == 'U'||
                c == 'á'|| c == 'Á'||c == 'é'|| c == 'É'||c == 'í'|| c == 'Í'||c == 'ó'|| c == 'Ó'|| c == 'ú'|| c == 'Ú') {
                contadorVocales = contadorVocales+1;
                }
        }
        System.out.println("Mostramos la informacion del texto");
        System.out.println("Texto creado el "+fechaCreacion);
        System.out.println("Ultima modificación "+ultimaModificacion);
        System.out.println(cadena);
        System.out.println("Un total de "+contadorVocales+" vocales");
    }
}
