import java.time.LocalDate;

public class Articulo{
        public Articulo(String titulo, Autor autor, LocalDate fechapublicacion, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechapublicacion = fechapublicacion;
        this.categoria = categoria;
}
@Override
public String toString() {
    return "Articulo [titulo=" + titulo + ", autor=" + autor + ", fechapublicacion=" + fechapublicacion
            + ", categoria=" + categoria + "]";
}
        private String titulo;
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        private Autor autor;
        public Autor getAutor() {
            return autor;
        }
        public void setAutor(Autor autor) {
            this.autor = autor;
        }
        private LocalDate fechapublicacion;
        public LocalDate getFechapublicacion() {
            return fechapublicacion;
        }
        public void setFechapublicacion(LocalDate fechapublicacion) {
            this.fechapublicacion = fechapublicacion;
        }
        private Categoria categoria;
        public Categoria getCategoria() {
            return categoria;
        }
        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }
}