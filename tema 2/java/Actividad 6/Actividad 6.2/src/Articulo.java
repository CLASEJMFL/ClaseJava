import java.time.LocalDate;

public class Articulo {
    private String titulo;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    private LocalDate fechaPublicacion;
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    private Categoria categoria;
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    private Autor autor;
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Articulo(String titulo, Autor autor, LocalDate fechaPublicacion, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return "Articulo [titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + ", categoria=" + categoria
                + ", autor=" + autor + "]";
    }  
}
