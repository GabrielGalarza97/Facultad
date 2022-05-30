package modelo;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private int cantEjemplares;

    public Libro(String titulo, String autor, int cantEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantEjemplares = cantEjemplares;
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

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }
    
    @Override
    public int compareTo(Libro libro){
        return this.autor.compareTo(libro.autor);
    }
}