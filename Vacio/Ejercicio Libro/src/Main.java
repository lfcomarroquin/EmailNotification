public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("La Sombra del Viento", "Carlos Ruiz Zafon", "Editorial Planeta", "Pasta Dura e ilustrada");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());
        System.out.println("Edicion: " + libro.getEdicion());
    }
}
