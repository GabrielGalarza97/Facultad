package modelo;

public class ExcepcionLibroNoDisponible extends Exception {
    public ExcepcionLibroNoDisponible() {
        super("\nNo quedan ejemplares disponibles.");
    }
}