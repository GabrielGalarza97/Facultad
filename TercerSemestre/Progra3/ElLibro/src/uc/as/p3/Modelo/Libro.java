package uc.as.p3.Modelo;

public class Libro {

    private String titulo;
    private String autor;
    private int añoDePublicacion;
    private String editorial;

    public Libro(String titulo, String autor, int añoDePublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
        this.editorial = editorial;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ");
        sb.append(titulo);
        sb.append(" | Autor: ");
        sb.append(autor);
        sb.append(" | Año de publicación: ");
        sb.append(añoDePublicacion);
        sb.append(" | Editorial: ");
        sb.append(editorial);

        return sb.toString();
    }
}
