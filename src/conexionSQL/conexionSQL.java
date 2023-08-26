/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author useer
 */
public class conexionSQL {
    Connection con = null;
    
    public Connection conexion(){
        try {
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/inventario","root", "");
         //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error Conexion"+e.getMessage());
        } 
        return con;
    }
}
