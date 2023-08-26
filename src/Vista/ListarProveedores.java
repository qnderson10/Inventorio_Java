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
 * @author Ivan
 */
public class ListarProveedores extends javax.swing.JDialog {

    private conexionSQL cc = new conexionSQL();  
    private Connection cn = cc.conexion();
    private control_existencias con = new control_existencias();
    private Object[][] datostabla;

    public ListarProveedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarDatosProveedores();
    }
    
    private void mostrarDatosProveedores(){
        DefaultTableModel tBProveedores = new DefaultTableModel();
        tBProveedores.addColumn("numeroDocumento");
        tBProveedores.addColumn("codTipoDocumento");
        tBProveedores.addColumn("nombreCompleto");
        tBProveedores.addColumn("nombreComercial");
        tBProveedores.addColumn("direccion");        
        tBProveedores.addColumn("codCiudadC");
        tBProveedores.addColumn("Telefono");
        tablaBuscarP.setModel(tBProveedores);
        if("".equals(getTfDocumentoP().getText())){
            boolean busqueda = false;
            tBProveedores = con.mostrarDatos(tBProveedores, "proveedor", getTfDocumentoP().getText(), "numeroDocumento", busqueda, 2);
            tablaBuscarP.setModel(tBProveedores);
        }
        else{
            boolean busqueda = true;
            tBProveedores = con.mostrarDatos(tBProveedores, "proveedor", getTfDocumentoP().getText(), "numeroDocumento", busqueda, 2);
            tablaBuscarP.setModel(tBProveedores);
        }
    }
    public void limpiar()
    {
        
       TfNombreP.setText("");
       TfDocumentoP.setText("");
    }
    
    public void  bloquear_cajas()
    {
       BCancelarBusqueda.setEnabled(false);

       BListar.setEnabled(false);
       TfNombreP.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BCancelarBusqueda = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        BListar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TfNombreP = new javax.swing.JTextField();
        TfDocumentoP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBuscarP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nombre Comercial: ");

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

        BListar.setText("Listar");
        BListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BListarActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero Documento: ");

        TfNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNombrePActionPerformed(evt);
            }
        });

        TfDocumentoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfDocumentoPActionPerformed(evt);
            }
        });

        tablaBuscarP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaBuscarP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BCancelarBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BSalir)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TfNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TfDocumentoP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TfNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TfDocumentoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCancelarBusqueda)
                    .addComponent(BSalir)
                    .addComponent(BListar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BSalirActionPerformed

    private void BCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarBusquedaActionPerformed
        // TODO add your handling code here:
        limpiar();
        mostrarDatosProveedores();
    }//GEN-LAST:event_BCancelarBusquedaActionPerformed

    private void TfNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNombrePActionPerformed

    private void TfDocumentoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfDocumentoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfDocumentoPActionPerformed

    private void BListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BListarActionPerformed
        // TODO add your handling code here:
        mostrarDatosProveedores();
    }//GEN-LAST:event_BListarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ListarProveedores dialog = new ListarProveedores(new javax.swing.JFrame(), true);
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

    public JTextField getTfDocumentoP() {
        return TfDocumentoP;
    }

    public void setTfDocumentoP(JTextField TfDocumentoP) {
        this.TfDocumentoP = TfDocumentoP;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelarBusqueda;
    private javax.swing.JButton BListar;
    private javax.swing.JButton BSalir;
    private javax.swing.JTextField TfDocumentoP;
    private javax.swing.JTextField TfNombreP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaBuscarP;
    // End of variables declaration//GEN-END:variables
}
