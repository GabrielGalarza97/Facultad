package uc.as.p3.Modelo;

public class Cliente {

    private String codigo;
    private String nombre;
    private Double montoCompra;

    public Cliente(String codigo, String nombre, double montoCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoCompra = montoCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMontoCompra(Double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void adicionarIva(double iva) {
        this.montoCompra = this.montoCompra + ((iva / 100) * this.montoCompra);
    }

    public void imprimir() {
        System.out.println("Codigo del cliente: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Monto (+IVA): " + montoCompra);
    }
}
