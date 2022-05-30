package uc.as.p3.Vista;

import uc.as.p3.Modelo.Producto;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazPrincipal extends JFrame {

    private JPanel contentPane;
    private panelProducto panel1;
    private panelProducto panel2;
    private panelProducto panel3;
//    private panelProducto panel4;
    private JLabel lblCantidadTotalEn;
    private JTextField txtTotalStock;
    private JLabel lblNewLabel_1;
    private JTextField txtTotalVendido;
    private JButton btnTerminar;

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    InterfazPrincipal frame = new InterfazPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public InterfazPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 659, 273);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panelTitulo = new JPanel();
        panelTitulo.setPreferredSize(new Dimension(10, 35));
        panelTitulo.setMinimumSize(new Dimension(10, 50));
        contentPane.add(panelTitulo, BorderLayout.NORTH);

        JLabel lblNewLabel = new JLabel("Control de Inventarios");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        panelTitulo.add(lblNewLabel);

        JPanel panelOperaciones = new JPanel();
        panelOperaciones.setPreferredSize(new Dimension(10, 35));
        contentPane.add(panelOperaciones, BorderLayout.SOUTH);
        panelOperaciones.setLayout(new GridLayout(0, 5, 0, 0));

        lblCantidadTotalEn = new JLabel("Cantidad Total en Stock:");
        panelOperaciones.add(lblCantidadTotalEn);

        txtTotalStock = new JTextField();
        panelOperaciones.add(txtTotalStock);
        txtTotalStock.setColumns(10);

        lblNewLabel_1 = new JLabel("Monto Total Vendido:");
        panelOperaciones.add(lblNewLabel_1);

        txtTotalVendido = new JTextField();
        panelOperaciones.add(txtTotalVendido);
        txtTotalVendido.setColumns(10);

        btnTerminar = new JButton("Terminar");
        btnTerminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        panelOperaciones.add(btnTerminar);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBorder(new TitledBorder(null, "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPane.add(panelPrincipal, BorderLayout.CENTER);
        panelPrincipal.setLayout(new GridLayout(0, 3, 0, 0));
        panel1 = new panelProducto(this);
        panel2 = new panelProducto(this);
        panel3 = new panelProducto(this);
        panel1.cambiarNombre("Jabon en Polvo");
        panel1.cambiarPrecioVenta(45000);
        panel1.cambiarStock(100);
        panel2.cambiarNombre("Jabon de Tocador");
        panel2.cambiarPrecioVenta(6000);
        panel2.cambiarStock(200);
        panel3.cambiarNombre("Detergente");
        panel3.cambiarPrecioVenta(4500);
        panel3.cambiarStock(10);
        panelPrincipal.add(panel1);
        panelPrincipal.add(panel2);
        panelPrincipal.add(panel3);
        setLocationRelativeTo(null);
    }

    public void cambiarStock() {
        int total = panel1.darProducto().darStock();
        total += panel2.darProducto().darStock();
        total += panel3.darProducto().darStock();
        txtTotalStock.setText("" + total);
    }

    public void cambiarMontoVendido() {
        Producto p = panel1.darProducto();
        int monto = p.darPrecioUnitarioVenta() * p.darVentas();
        p = panel2.darProducto();
        monto += p.darPrecioUnitarioVenta() * p.darVentas();
        p = panel3.darProducto();
        monto += p.darPrecioUnitarioVenta() * p.darVentas();
        txtTotalVendido.setText("Gs. " + monto);
    }
}
