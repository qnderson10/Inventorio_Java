/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernanda
 */
public class Principal extends javax.swing.JFrame {
    conexionSQL cc = new conexionSQL();  
    Connection con = cc.conexion();
    
            
            
    public Principal() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BFacturacionVenta = new javax.swing.JButton();
        BFacturacionCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BArqueo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MBuscarCliente = new javax.swing.JMenuItem();
        MRegistroCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MBuscarProducto = new javax.swing.JMenuItem();
        ListarProductos = new javax.swing.JMenuItem();
        MRegistrarProducto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MConsultarVentas = new javax.swing.JMenuItem();
        MConsultarCompras = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MBuscarProveedoresActionPerformed = new javax.swing.JMenuItem();
        ListarProveedores = new javax.swing.JMenuItem();
        RegistroProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BFacturacionVenta.setText("Venta");
        BFacturacionVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFacturacionVentaActionPerformed(evt);
            }
        });

        BFacturacionCompra.setText("Compra");
        BFacturacionCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFacturacionCompraActionPerformed(evt);
            }
        });

        jLabel1.setText("Realizar facturacion de :");

        jLabel2.setText("Realizar: ");

        BArqueo.setText("Arqueo");
        BArqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArqueoActionPerformed(evt);
            }
        });

        jMenu1.setText("Clientes");
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 40));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MBuscarCliente.setText("Buscar Cliente");
        MBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBuscarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(MBuscarCliente);

        MRegistroCliente.setText("Registrar Cliente");
        MRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRegistroClienteActionPerformed(evt);
            }
        });
        jMenu1.add(MRegistroCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 40));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        MBuscarProducto.setText("Buscar Producto");
        MBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBuscarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(MBuscarProducto);

        ListarProductos.setText("Listar Productos");
        ListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarProductosActionPerformed(evt);
            }
        });
        jMenu2.add(ListarProductos);

        MRegistrarProducto.setText("Registrar ");
        MRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRegistrarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(MRegistrarProducto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setMinimumSize(new java.awt.Dimension(200, 40));
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 40));

        MConsultarVentas.setText("Consultar ventas");
        MConsultarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MConsultarVentasActionPerformed(evt);
            }
        });
        jMenu3.add(MConsultarVentas);

        MConsultarCompras.setText("Consultar compras");
        MConsultarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MConsultarComprasActionPerformed(evt);
            }
        });
        jMenu3.add(MConsultarCompras);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Proveedores");
        jMenu4.setToolTipText("");
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 40));

        MBuscarProveedoresActionPerformed.setText("Buscar Proveedor");
        MBuscarProveedoresActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBuscarProveedoresActionPerformedActionPerformed(evt);
            }
        });
        jMenu4.add(MBuscarProveedoresActionPerformed);

        ListarProveedores.setText("Listar Proveedores");
        ListarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarProveedoresActionPerformed(evt);
            }
        });
        jMenu4.add(ListarProveedores);

        RegistroProveedores.setText("Registrar Proveedor");
        RegistroProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroProveedoresActionPerformed(evt);
            }
        });
        jMenu4.add(RegistroProveedores);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BFacturacionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BFacturacionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addComponent(BArqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(348, 348, 348))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BFacturacionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(BFacturacionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(BArqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBuscarClienteActionPerformed
        BuscarCliente cli = new BuscarCliente(this, false);
        cli.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MBuscarClienteActionPerformed

    private void BFacturacionVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFacturacionVentaActionPerformed
        FacturacionVenta fac = new FacturacionVenta(this, false);
        fac.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BFacturacionVentaActionPerformed

    private void MRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRegistroClienteActionPerformed
        // TODO add your handling code here:
        RegistroCliente cli = new RegistroCliente(this, true);
        cli.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_MRegistroClienteActionPerformed

    private void MRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRegistrarProductoActionPerformed
        RegistrarProducto pro = new RegistrarProducto(this, true);
        pro.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MRegistrarProductoActionPerformed

    private void ListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarProductosActionPerformed
        ListarProductos pro = new ListarProductos(this, false);
        pro.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_ListarProductosActionPerformed

    private void MBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBuscarProductoActionPerformed
        BuscarProducto pro = new BuscarProducto(this, false);
        pro.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MBuscarProductoActionPerformed

    private void MConsultarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MConsultarVentasActionPerformed
        ConsultarVentas con = new ConsultarVentas(this, true);
        con.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MConsultarVentasActionPerformed

    private void MConsultarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MConsultarComprasActionPerformed
        ConsultarCompras con = new ConsultarCompras(this, true);
        con.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MConsultarComprasActionPerformed

    private void MBuscarProveedoresActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBuscarProveedoresActionPerformedActionPerformed
        BuscarProveedores con = new BuscarProveedores(this, false);
        con.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MBuscarProveedoresActionPerformedActionPerformed

    private void ListarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarProveedoresActionPerformed
        ListarProveedores con = new ListarProveedores(this, false);
        con.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_ListarProveedoresActionPerformed

    private void RegistroProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroProveedoresActionPerformed
        RegistroProveedores con = new RegistroProveedores(this, true);
        con.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_RegistroProveedoresActionPerformed

    private void BFacturacionCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFacturacionCompraActionPerformed
        FacturacionCompra fac = new FacturacionCompra(this, false);
        fac.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BFacturacionCompraActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        ListarProductos pro = new ListarProductos(this, true);
        pro.setVisible(rootPaneCheckingEnabled);
                
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void BArqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArqueoActionPerformed
        // TODO add your handling code here:
        Arqueo ar = new Arqueo(this, false);
        ar.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BArqueoActionPerformed
   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BArqueo;
    private javax.swing.JButton BFacturacionCompra;
    private javax.swing.JButton BFacturacionVenta;
    private javax.swing.JMenuItem ListarProductos;
    private javax.swing.JMenuItem ListarProveedores;
    private javax.swing.JMenuItem MBuscarCliente;
    private javax.swing.JMenuItem MBuscarProducto;
    private javax.swing.JMenuItem MBuscarProveedoresActionPerformed;
    private javax.swing.JMenuItem MConsultarCompras;
    private javax.swing.JMenuItem MConsultarVentas;
    private javax.swing.JMenuItem MRegistrarProducto;
    private javax.swing.JMenuItem MRegistroCliente;
    private javax.swing.JMenuItem RegistroProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
