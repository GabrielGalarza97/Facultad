package modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Seccion {
    private String materia;
    private ArrayList<Libro> libros;
    
    public void Seccion (){
        
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
        Collections.sort(libros);
    }
    
    public Libro buscarLibro(String titulo, String autor) throws ExcepcionLibroNoEncontrado {
        Libro libroBuscado = null;
        
        for (Libro libro : libros) {
            if (titulo.equalsIgnoreCase(libro.getTitulo()) && autor.equalsIgnoreCase(libro.getAutor())){
                libroBuscado = libro;
                break;
            }
        }
        
        if (libroBuscado != null){
            return libroBuscado;
        }else{
            throw new ExcepcionLibroNoEncontrado();
        }
    }
    
    public void prestarLibro(String titulo, String autor) throws ExcepcionLibroNoDisponible, ExcepcionLibroNoEncontrado {
        Libro libro = buscarLibro(titulo, autor);
        int ejemplares = libro.getCantEjemplares();
        
        if (ejemplares == 0){
            throw new ExcepcionLibroNoDisponible();
        }else{
            --ejemplares;
            libro.setCantEjemplares(ejemplares);
        }
    }
    
    public void devolverLibro(String titulo, String autor) throws ExcepcionLibroNoEncontrado {
        Libro libro = buscarLibro(titulo, autor);
        libro.setCantEjemplares(libro.getCantEjemplares()+i);
    }
    
    public void borrarLibro(Libro libro) throws ExcepcionLibroNoEncontrado {
        
    }
}