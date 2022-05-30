package uc.as.p3.Modelo;

public class Producto {

    private String nombre;
    private int precioUnitarioVenta;
    private int stock;
    private int cantidadVendida;

    public void inicializar(String nom, int precio, int inv) {

        cantidadVendida = 0;
    }

    public String darNombre() {
        return nombre;
    }

    public int darStock() {
        return this.stock;
    }

    public int darVentas() {
        return this.cantidadVendida;
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
