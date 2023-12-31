
package Vista;

import Controlador.control_existencias;
import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class BuscarCliente extends javax.swing.JDialog {

    
    private conexionSQL cc = new conexionSQL();  
    private Connection cn = cc.conexion();
    private control_existencias con = new control_existencias();
    private Object[][] datostabla;

    public BuscarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarDatosCliente();
    }
    
    private void mostrarDatosCliente(){
        DefaultTableModel tBClientes = new DefaultTableModel();
        tBClientes.addColumn("documento");
        tBClientes.addColumn("codTipoDocument");
        tBClientes.addColumn("nombreCompletoC");
       
        tBClientes.addColumn("direccionC");        
        tBClientes.addColumn("codCiudadC");
        tBClientes.addColumn("telefonoC");
        tabladatos.setModel(tBClientes);
        if("".equals(getTfDocumento().getText())){
            boolean busqueda = false;
            tBClientes = con.mostrarDatos(tBClientes, "cliente", getTfDocumento().getText(), "documento", busqueda, 1);
            tabladatos.setModel(tBClientes);
        }
        else{
            boolean busqueda = true;
            tBClientes = con.mostrarDatos(tBClientes, "cliente", getTfDocumento().getText(), "documento", busqueda, 1);
            tabladatos.setModel(tBClientes);
        }
    }
    public void limpiar()
    {
       TfDocumento.setText("");
       CBTipoD.setName("");
       //TfDescripcionCliente.setText("");        
    }
    
    public void  bloquear_cajas()
    {
       TfDocumento.setEnabled(false);
       CBTipoD.setEnabled(false); 
       BCancelarBusqueda.setEnabled(false);
       //TfDescripcionCliente.setEnabled(false);
       BActualizar.setEnabled(false);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabladatos2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TfDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CBTipoD = new javax.swing.JComboBox<>();
        BCancelarBusqueda = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();

        tabladatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "documento", "codTipoDocument", "nombreCompletoC", "direccionC", "codCiudadC", "telefonoC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabladatos2.getTableHeader().setReorderingAllowed(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Numero de documento :");

        TfDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfDocumentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de documento");

        CBTipoD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        BActualizar.setText("Buscar");
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabladatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabladatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(BCancelarBusqueda)
                        .addGap(18, 18, 18)
                        .addComponent(BSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(TfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(CBTipoD, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CBTipoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BActualizar)
                    .addComponent(BCancelarBusqueda)
                    .addComponent(BSalir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfDocumentoActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BSalirActionPerformed

    private void BCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarBusquedaActionPerformed
        // TODO add your handling code here:
        
        limpiar();
        mostrarDatosCliente();
    }//GEN-LAST:event_BCancelarBusquedaActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        // TODO add your handling code here:
        mostrarDatosCliente();
    }//GEN-LAST:event_BActualizarActionPerformed

    public JTextField getTfDocumento() {
        return TfDocumento;
    }

    public void setTfDocumento(JTextField TfDocumento) {
        this.TfDocumento = TfDocumento;
    }

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
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarCliente dialog = new BuscarCliente(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BCancelarBusqueda;
    private javax.swing.JButton BSalir;
    private javax.swing.JComboBox<String> CBTipoD;
    private javax.swing.JTextField TfDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTable tabladatos2;
    // End of variables declaration//GEN-END:variables
}
