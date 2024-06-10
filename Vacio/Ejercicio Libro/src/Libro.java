public class Libro {
    // Atributos para un libro: titulo, autor, editorial, edicion
    // Acciones a realizar: obtener detalles, actualizar precio, actualizar existencias
    private String titulo;
    private String autor;
    private String editorial;
    private String edicion;

    //Constructor con parametros
    public Libro(String titulo, String autor, String editorial, String edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
