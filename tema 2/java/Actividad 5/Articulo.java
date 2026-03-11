import java.time.LocalDate;

public class Articulo {
    private String titulo;
    public String getTtitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAuthor(Autor autor) {
        this.autor = autor;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Autor getAutor() {
        return autor;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    private Autor autor;
    private LocalDate fechaPublicacion;
    private Categoria categoria;
    public Articulo(String titulo, Autor autor, LocalDate fechaPublicacion, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.categoria = categoria;
    }
    public Articulo() {
    }
    @Override
    public String toString() {
        return "Articulo [titulo=" + titulo + ", autor"
        + autor.toString() + ", fechaPublicacion="+ fechaPublicacion
            + ",categoria=" + categoria.toString() + "]";
    }
}