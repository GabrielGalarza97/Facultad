package uc.as.p3.Modelo;

public class ExcepcionLibroNoEncontrado extends Exception {

    public ExcepcionLibroNoEncontrado() {
        super("\nNo se encuentra el libro indicado");
    }
}
