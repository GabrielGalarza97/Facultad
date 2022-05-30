package modelo;

public class Producto {

    private String nombre;
    private int precioUnitarioVenta;
    private int stock;
    private int ventas;

    public void inicializar(String nom, int precio, int inv) {
        
        ventas = 0;
    }

    public String darNombre() {
        return nombre;
    }

    public int darStock() {
        return this.stock;
    }

    public int darVentas() {
        return this.ventas;
    }

    public int darPrecioUnitarioVenta() {
        return this.precioUnitarioVenta;
    }

    public void cambiarNombre(String nom) {
        nombre = nom;
    }

    public void cambiarPrecio(int precio) {
        this.precioUnitarioVenta = precio;
    }

    public void cambiarStock(int c) {
        this.stock = c;
    }

    public void vender(int cantidad) {
        
    }

    public void comprar(int cantidad) {

    }
}