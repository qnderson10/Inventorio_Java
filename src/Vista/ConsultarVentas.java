/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Controlador.control_existencias;
import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda
 */
public class ConsultarVentas extends javax.swing.JDialog {

    private conexionSQL cc = new conexionSQL();  
    private Connection cn = cc.conexion();
    private control_existencias con = new control_existencias();
    private Object[][] datostabla;

    public ConsultarVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarDatosCC();
    }
    
    private void mostrarDatosCC(){
        DefaultTableModel tconsultaV = new DefaultTableModel();
        tconsultaV.addColumn("numFactura");
        tconsultaV.addColumn("codCliente");
        tconsultaV.addColumn("codProducto");
        tconsultaV.addColumn("cantidad");
        tconsultaV.addColumn("nombreEmpledo");
        tconsultaV.addColumn("fecha_facturación");
        tconsultaV.addColumn("codFormaPago");
        tconsultaV.addColumn("totalFactura");
        TablaCV.setModel(tconsultaV);
        if("".equals(getTfNumeroFactura().getText())){
            boolean busqueda = false;
            tconsultaV = con.mostrarDatos(tconsultaV, "venta", getTfNumeroFactura().getText(), "numFactura", busqueda, 3);
            TablaCV.setModel(tconsultaV);
        }
        else{
            boolean busqueda = true;
            tconsultaV = con.mostrarDatos(tconsultaV, "venta", getTfNumeroFactura().getText(), "numFactura", busqueda, 3);
            TablaCV.setModel(tconsultaV);
        }
    }
    public void limpiar()
    {
       TfNumeroFactura.setText("");
           
       TfFechaVenta.setText("");
    }
    
    public void  bloquear_cajas()
    {
       TfNumeroFactura.setEnabled(false); 
       BCancelarBusqueda.setEnabled(false);
       
       BConsultar.setEnabled(false);
       TfFechaVenta.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TfNumeroFactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BCancelarBusqueda = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        BConsultar = new javax.swing.JButton();
        TfFechaVenta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Número de factura:");

        TfNumeroFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNumeroFacturaActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha de la venta:");

        BCancelarBusqueda.setText("Cancelar");
        BCancelarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarBusquedaActionPerformed(evt);
            }
        });

        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        BConsultar.setText("Consultar");
        BConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConsultarActionPerformed(evt);
            }
        });

        TablaCV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaCV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BCancelarBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSalir)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TfNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TfFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TfNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TfFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BConsultar)
                    .addComponent(BCancelarBusqueda)
                    .addComponent(BSalir))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfNumeroFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNumeroFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNumeroFacturaActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BSalirActionPerformed

    private void BCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarBusquedaActionPerformed
        // TODO add your handling code here:
   
        limpiar();
        mostrarDatosCC();
    }//GEN-LAST:event_BCancelarBusquedaActionPerformed

    private void BConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConsultarActionPerformed
        // TODO add your handling code here:
        mostrarDatosCC();
    }//GEN-LAST:event_BConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarVentas dialog = new ConsultarVentas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JTextField getTfNumeroFactura() {
        return TfNumeroFactura;
    }

    public void setTfNumeroFactura(JTextField TfNumeroFactura) {
        this.TfNumeroFactura = TfNumeroFactura;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelarBusqueda;
    private javax.swing.JButton BConsultar;
    private javax.swing.JButton BSalir;
    private javax.swing.JTable TablaCV;
    private javax.swing.JTextField TfFechaVenta;
    private javax.swing.JTextField TfNumeroFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
