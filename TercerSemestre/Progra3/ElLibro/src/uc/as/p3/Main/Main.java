package uc.as.p3.Main;

import uc.as.p3.Modelo.Libro;

public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro("La Bella y la Bestia", "Alguien", 1990, "Disney");
        Libro libro2 = new Libro("Blancanieves", "Alguien mas", 1995, "Disney tambien");
        
        System.out.println(libro.toString());
        System.out.println(libro2.toString());
    }

}
