package vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panelProducto extends JPanel {

    private JTextField txtNombre;
    private JTextField txtPrecioVenta;
    private JTextField txtStock;
    private Producto producto;
    private JFrame parent;

    public panelProducto(JFrame p) {
        setLayout(new GridLayout(4, 2, 0, 0));

        parent = p;
        producto = new Producto();
        JLabel lblNombre = new JLabel("Nombre:");
        add(lblNombre);

        txtNombre = new JTextField();
        add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblPrecioVenta = new JLabel("Precio Venta:");
        add(lblPrecioVenta);

        txtPrecioVenta = new JTextField();
        add(txtPrecioVenta);
        txtPrecioVenta.setColumns(10);

        JLabel lblStock = new JLabel("Stock:");
        add(lblStock);

        txtStock = new JTextField();
        add(txtStock);
        txtStock.setColumns(10);

        JButton btnComprar = new JButton("Comprar");
        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                comprar();
                InterfazPrincipal p = (InterfazPrincipal) parent;
                p.cambiarStock();
            }
        });
        add(btnComprar);

        JButton btnVender = new JButton("Vender");
        btnVender.addActionListener((ActionEvent e) -> {
            vender();
            InterfazPrincipal p1 = (InterfazPrincipal) parent;
            p1.cambiarMontoVendido();
        });
        add(btnVender);

    }

    public String darNombre() {
        return txtNombre.getText();
    }

    public Producto darProducto() {
        return producto;
    }

    public int darPrecioVenta() {
        return Integer.parseInt(txtPrecioVenta.getText());
    }

    public int darStock() {
        return Integer.parseInt(txtStock.getText());
    }

    public void cambiarNombre(String nombre) {
        txtNombre.setText(nombre);
        producto.cambiarNombre(nombre);
    }

    public void cambiarPrecioVenta(int precio) {
        txtPrecioVenta.setText("" + precio);
        producto.cambiarPrecio(precio);
    }

    public void cambiarStock(int stock) {
        txtStock.setText("" + (producto.darStock() + stock));
        producto.cambiarStock(producto.darStock() + stock);
    }

    public void comprar() {
        int compra = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de producto comprada"));
        cambiarStock(compra);
    }

    public void vender() {
        int venta = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de producto vendida"));
        cambiarStock(venta * (- 1));
        producto.vender(venta);
    }
}
