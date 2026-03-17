public class CuentaUsuario {
    String nombreUsuario;
    String email;
    int edad;
    boolean activa;

    public CuentaUsuario(String nombreUsuario, String email, int edad, boolean activa) {
        this.nombreUsuario = nombreUsuario;

        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            this.email = "correo@invalido.com";
        }

        if (edad < 18) {
            this.activa = false;
        } else {
            this.activa = activa;
        }

        this.edad = edad;
    }

    public CuentaUsuario(String nombreUsuario, String email) {
        this.nombreUsuario = nombreUsuario;

        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            this.email = "correo@invalido.com";
        }

        this.edad = 18;
        this.activa = true;
    }

    void obtenerResumen() {
        if (edad < 18) {
            System.out.println("No puede darse de alta en la plataforma por ser menor de edad.");
        } else {
            System.out.println("Cuenta: ["+nombreUsuario+"] | Email: ["+email+" | Edad: ["+edad+"] | Activa: ["+activa+"]");
        }
    }

    
}
