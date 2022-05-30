/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on 29-oct-2014, 3:17:29
 */

package vista;

import java.awt.Frame;
import javax.swing.JOptionPane;
import lpv.modelo.Biblioteca;
import lpv.modelo.ExcepcionLibroNoDisponible;
import lpv.modelo.ExcepcionLibroNoEncontrado;
import lpv.modelo.Libro;
import lpv.modelo.Seccion;
import org.jvnet.substance.SubstanceLookAndFeel;
import static org.jvnet.substance.SubstanceLookAndFeel.*;

/**
 *
 * @author fiunac2
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    private Biblioteca biblioteca;
  

    public MainWindow() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        biblioteca = new Biblioteca();
        cargarDatos();
        
    }
    private void cargarDatos() {
        biblioteca.agregarSeccion("Informática");
        
        biblioteca.agregarSeccion("Matemática");
        
        biblioteca.agregarSeccion("Electrónica");
        
        Seccion informatica = biblioteca.getLista().get(0);
        Seccion matem = biblioteca.getLista().get(1);
        Seccion electronica = biblioteca.getLista().get(2);
        informatica.agregarLibro("Introducción a la Informática", "Juan Gracia", 2);;
        informatica.agregarLibro("Programación en Java", "Javier Ceballos", 3);
        matem.agregarLibro("Cálculo Diferencial e integral", "Roberto Jovellanos", 1);
        matem.agregarLibro("Geometría Plana y Espacial", "Gabriel Zoloaga", 1);
        electronica.agregarLibro("Circuitos Combinacionales", "Juan Malvino", 2);
        electronica.agregarLibro("Sistemas Digitales", "José Cardozo",1);
        
    }

    private void desplegarDatos(int i) {
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAgregarSeccion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuAgregarLibro = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Programa");

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sección");

        mnuAgregarSeccion.setText("Agregar Sección");
        mnuAgregarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarSeccionActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAgregarSeccion);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Libros");

        mnuAgregarLibro.setText("Agregar");
        mnuAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarLibroActionPerformed(evt);
            }
        });
        jMenu4.add(mnuAgregarLibro);

        jMenuItem1.setText("Prestar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Devolver");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuAgregarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarSeccionActionPerformed
        String nombreSeccion = JOptionPane.showInputDialog(this, "Introduzca el nombre de la nueva sección de libros");
        biblioteca.agregarSeccion(nombreSeccion);
    }//GEN-LAST:event_mnuAgregarSeccionActionPerformed

    private void mnuAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarLibroActionPerformed
        // TODO add your handling code here:
        DialogAgregarLibro d = new DialogAgregarLibro(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_mnuAgregarLibroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mnuAgregarLibro;
    private javax.swing.JMenuItem mnuAgregarSeccion;
    // End of variables declaration//GEN-END:variables

}