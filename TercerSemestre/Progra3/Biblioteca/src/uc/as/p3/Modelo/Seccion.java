package uc.as.p3.Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Seccion implements Serializable {

    private String disciplina;
    private ArrayList<Libro> libros;

    public Seccion(Seccion seccion) {
        this.disciplina = seccion.disciplina;
        this.libros = seccion.libros;
    }

    public Seccion(String disciplina, ArrayList<Libro> libros) {
        this.disciplina = disciplina;
        this.libros = libros;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        Collections.sort(libros);
    }

    public Libro buscarLibro(String titulo, String autor) throws ExcepcionLibroNoEncontrado {
        Libro libroBuscado = null;

        for (Libro libro : libros) {
            if (titulo.equalsIgnoreCase(libro.getTitulo()) && autor.equalsIgnoreCase(libro.getAutor())) {
                libroBuscado = libro;
                break;
            }
        }

        if (libroBuscado != null) {
            return libroBuscado;
        } else {
            throw new ExcepcionLibroNoEncontrado();
        }
    }

    public void prestarLibro(String titulo, String autor) throws ExcepcionLibroNoDisponible, ExcepcionLibroNoEncontrado {
        Libro libro = buscarLibro(titulo, autor);
        int ejemplares = libro.getCantEjemplares();

        if (ejemplares == 0) {
            throw new ExcepcionLibroNoDisponible();
        } else {
            --ejemplares;
            libro.setCantEjemplares(ejemplares);
        }
    }

    public void devolverLibro(String titulo, String autor) throws ExcepcionLibroNoEncontrado {
        Libro libro = buscarLibro(titulo, autor);
        libro.setCantEjemplares(libro.getCantEjemplares());
    }
    
    public void insertarLibro(Libro libro){
        //insertar el libro
    }

    public void borrarLibro(Libro libro) throws ExcepcionLibroNoEncontrado {
        libro = buscarLibro(libro.getTitulo(), libro.getAutor());
        int ejemplares = libro.getCantEjemplares();
        
        if (ejemplares == 0){
            throw new ExcepcionLibroNoEncontrado();
        }else{
            //borrar el libro
        }
    }
    
    public void guardarObjeto() throws IOException {
        try {
            Seccion seccion = new Seccion(this);
            Seccion seccion2 = new Seccion(this);
            FileOutputStream fos = new FileOutputStream("seccion.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seccion);
            oos.writeObject(seccion2);
            oos.close();
            fos.close();
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void leerObjeto() throws IOException, ClassNotFoundException {
        try {
            Seccion seccion = new Seccion(this);
            FileInputStream fis = new FileInputStream("seccion.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            seccion = (Seccion) ois.readObject(); //usar el objeto seccion
            seccion = (Seccion) ois.readObject(); //ya pasa al sgte fichero
            
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
