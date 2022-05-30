package uc.as.p3.Modelo;

public class ExcepcionLibroNoDisponible extends Exception {

    public ExcepcionLibroNoDisponible() {
        super("\nNo quedan ejemplares disponibles.");
    }
}
