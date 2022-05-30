package uc.as.p3.Modelo;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Seccion> secciones;

    public Biblioteca() {
        secciones = new ArrayList<>();
    }

    public void agregarSeccion(Seccion seccion) {
        secciones.add(new Seccion(seccion));
    }

    public void borrarSeccion(String seccion) {
        int n;
        n = secciones.size();

        for (int i = 0; i < n; i++) {
            if (seccion.equalsIgnoreCase(secciones.get(i).getDisciplina())) {
                secciones.remove(i);
                break;
            }
        }
    }

    public ArrayList<Seccion> getLista() {
        return secciones;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\nBiblioteca");

        for (Seccion s : secciones) {
            str.append(s).append("\n");
        }

        return str.toString();
    }
}
