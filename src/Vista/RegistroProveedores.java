/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Controlador.control_existencias;
import Modelo.Ciudad;
import Modelo.Proveedor;
import Modelo.TipoDocumento;
import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ivan
 */
public class RegistroProveedores extends javax.swing.JDialog {
        conexionSQL cc = new conexionSQL();  
        Connection cn = cc.conexion();
        control_existencias con = new control_existencias();
    
    public RegistroProveedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        con.combox(CBCiudad, "ciudad", "nombreCiudad");
        con.combox(CBTipoD, "tipodocumento", "descripcion");
        
    }

    public void limpiar() {
      
        CBTipoD.setName("");
        TfNombreP.setText("");
        TfDireccionP.setText("");
        TfTelefono.setText("");
        CBCiudad.setName("");
        TfNombreCompleto.setText("");

    }

    public void bloquear_cajas() {
        TfNombreCompleto.setEnabled(false);
        
        CBTipoD.setEnabled(false);
        TfNombreP.setEnabled(false);
        TfDireccionP.setEnabled(false);
        TfTelefono.setEnabled(false);
        BotonRegistroP.setEnabled(false);
        BCancelarRegistro.setEnabled(false);
        CBCiudad.setEnabled(false);

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
        CBTipoD = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        TfNombreP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TfDireccionP = new javax.swing.JTextField();
        CBCiudad = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        TfTelefono = new javax.swing.JTextField();
        BotonRegistroP = new javax.swing.JButton();
        BCancelarRegistro = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TfNombreCompleto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TfDocumentoProveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Tipo de documento: ");

        jLabel3.setText("Nombre Comercial: ");

        TfNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNombrePActionPerformed(evt);
            }
        });

        jLabel4.setText("Direccion Comercial : ");

        jLabel5.setText("Ciudad : ");

        TfDireccionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfDireccionPActionPerformed(evt);
            }
        });

        CBCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCiudadActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de Telefono : ");

        BotonRegistroP.setText("Registrar");
        BotonRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroPActionPerformed(evt);
            }
        });

        BCancelarRegistro.setText("Cancelar");
        BCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarRegistroActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre completo:");

        jLabel1.setText("Documento Proveedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonRegistroP)
                        .addGap(18, 18, 18)
                        .addComponent(BCancelarRegistro)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel1)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBTipoD, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(CBCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TfNombreCompleto)
                                    .addComponent(TfNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(TfDocumentoProveedor)
                                    .addComponent(TfDireccionP)
                                    .addComponent(TfTelefono))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBTipoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CBCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfDocumentoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfDireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistroP)
                    .addComponent(BCancelarRegistro)
                    .addComponent(jButton3))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNombrePActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroPActionPerformed
        Proveedor proveedor = new Proveedor();
        proveedor.setNumeroDocumento(Integer.parseInt(getTfDocumentoProveedor().getText()));
        proveedor.setCodTipoDocumento(getCBTipoD().getSelectedIndex()+1);
        proveedor.setNombreCompleto(getTfNombreCompleto().getText());
        proveedor.setNombreComercial(getTfNombreP().getText());
        proveedor.setDireccion(getTfDireccionP().getText());
        proveedor.setCodCiudad(getCBCiudad().getSelectedIndex()+1);
        proveedor.setTelefono(getTfTelefono().getText());
        con.insertarProveedorNuevo(proveedor);
    }//GEN-LAST:event_BotonRegistroPActionPerformed

    private void BCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarRegistroActionPerformed
        // TODO add your handling code here:
        bloquear_cajas();
        limpiar();
    }//GEN-LAST:event_BCancelarRegistroActionPerformed

    private void CBCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCiudadActionPerformed

    private void TfDireccionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfDireccionPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfDireccionPActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroProveedores dialog = new RegistroProveedores(new javax.swing.JFrame(), true);
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
 
    public JButton getBCancelarRegistro() {
        return BCancelarRegistro;
    }

    public void setBCancelarRegistro(JButton BCancelarRegistro) {
        this.BCancelarRegistro = BCancelarRegistro;
    }

    public JButton getBotonRegistroP() {
        return BotonRegistroP;
    }

    public void setBotonRegistroP(JButton BotonRegistroP) {
        this.BotonRegistroP = BotonRegistroP;
    }

    public JComboBox<String> getCBCiudad() {
        return CBCiudad;
    }

    public void setCBCiudad(JComboBox<String> CBCiudad) {
        this.CBCiudad = CBCiudad;
    }

    public JComboBox<String> getCBTipoD() {
        return CBTipoD;
    }

    public void setCBTipoD(JComboBox<String> CBTipoD) {
        this.CBTipoD = CBTipoD;
    }

    public JTextField getTfDireccionP() {
        return TfDireccionP;
    }

    public void setTfDireccionP(JTextField TfDireccionP) {
        this.TfDireccionP = TfDireccionP;
    }

    public JTextField getTfNombreCompleto() {
        return TfNombreCompleto;
    }

    public void setTfNombreCompleto(JTextField TfNombreCompleto) {
        this.TfNombreCompleto = TfNombreCompleto;
    }

    public JTextField getTfNombreP() {
        return TfNombreP;
    }

    public void setTfNombreP(JTextField TfNombreP) {
        this.TfNombreP = TfNombreP;
    }

    public JTextField getTfTelefono() {
        return TfTelefono;
    }

    public void setTfTelefono(JTextField TfTelefono) {
        this.TfTelefono = TfTelefono;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JTextField getTfDocumentoProveedor() {
        return TfDocumentoProveedor;
    }

    public void setTfDocumentoProveedor(JTextField TfDocumentoProveedor) {
        this.TfDocumentoProveedor = TfDocumentoProveedor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelarRegistro;
    private javax.swing.JButton BotonRegistroP;
    private javax.swing.JComboBox CBCiudad;
    private javax.swing.JComboBox CBTipoD;
    private javax.swing.JTextField TfDireccionP;
    private javax.swing.JTextField TfDocumentoProveedor;
    private javax.swing.JTextField TfNombreCompleto;
    private javax.swing.JTextField TfNombreP;
    private javax.swing.JTextField TfTelefono;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
