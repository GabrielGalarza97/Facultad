package modelo;

public class ExcepcionLibroNoEncontrado extends Exception {
    public ExcepcionLibroNoEncontrado(){
        super("\nNo se encuentra el libro indicado");
    }
}
