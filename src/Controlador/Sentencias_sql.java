
package Controlador;

import Modelo.FormaPago;
import Modelo.Producto;
import com.sun.crypto.provider.RSACipher;
import conexionSQL.conexionSQL;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES
 */
public class Sentencias_sql {
    
    private conexionSQL con = new conexionSQL();  
    private Connection cn = con.conexion();
    private PreparedStatement ps;
    private ResultSet res;

    public Sentencias_sql() {
    }
    
    public boolean insertar(String datos[], String insert){
      boolean estado = false;
       try {
            ps = con.conexion().prepareStatement(insert);
            for(int i=0; i<=datos.length-1;i++){
                ps.setString(i+1, datos[i]);
            }
            ps.execute();
            ps.close();
            estado = true;
         }catch(SQLException e){
         System.out.println(e);
      }
       return estado;
   }
    
     public Object [][] GetTabla(String colName[], String tabla, String sql){
      int registros = 0;
      
      try{
         ps = con.conexion().prepareStatement("select count(*) as total from " + tabla);
         res = ps.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }

    Object[][] data = new String[registros][colName.length];
    String col[] = new String[colName.length];
    
      try{
         ps = con.conexion().prepareStatement(sql);
         res = ps.executeQuery();
         int i = 0;
         while(res.next()){
            for(int j=0; j<=colName.length-1;j++){
                col[j] = res.getString(colName[j]);
                data[i][j] = col[j];
            }
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }
     
     public boolean existencias(String campo, String from_where){
     int registros = 0;
     try{
         ps = con.conexion().prepareStatement("SELECT count(*) as total  " + from_where);
         res = ps.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
     
     if (registros >0)
     {return true;
     }
     else
     {
         return false;
     }
  }
     public String datos_string(String nombre_columna, String sentenciasql){
        
    String datos ="";
      try{
         ps = con.conexion().prepareStatement(sentenciasql);
         res = ps.executeQuery();
         while(res.next()){
            datos = res.getString(nombre_columna);
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return datos;
    }
     
     public void poblar_combox(JComboBox Cb, String tabla, String nombreCol){
        Cb.removeAllItems();
        try {
            String SQL = "SELECT " + nombreCol + " from " + tabla;
            PreparedStatement pst = cn.prepareStatement(SQL);   
            ArrayList listaItems = new ArrayList();
            ResultSet resultado = pst.executeQuery();
            while(resultado.next()){
                listaItems.add(resultado.getString(nombreCol));
            }
            Iterator iterador = listaItems.iterator();
            while(iterador.hasNext()){
                Object items = (Object) iterador.next();
                Cb.addItem(items);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Eror al llenar el comboBox"+e.getMessage());   
        }
    }
     
    public Double datos_totalfactura(String campo, String sql){
    double data =0;
      try{
         ps= con.conexion().prepareStatement(sql);
         res = ps.executeQuery();
         while(res.next()){
            data = res.getDouble(campo);
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
     public ResultSet buscarProducto(int idProducto){
         ResultSet resultado = null;
         try{
                String sqlStatement = String.format("SELECT * FROM producto WHERE %d = idProducto LIMIT 1", idProducto);
                PreparedStatement prdStmt1  = cn.prepareStatement(sqlStatement);
                resultado = prdStmt1.executeQuery();
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"Error al buscar producto "+e.getMessage());   
            }
        return resultado;
         
     }
     
     public void actualizarStockProducto(String newStock, int idProducto){
         try{
                String actualizarProductoSqlStatement = String.format("UPDATE producto SET stock=%s WHERE idProducto = %s", newStock, idProducto);
                PreparedStatement prdStmt  = cn.prepareStatement(actualizarProductoSqlStatement);
                prdStmt.execute();  
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"Error al actualizar producto"+e.getMessage());   
            }
         
     }
     
     public boolean actualizarPreciosProducto(double precioCosto, double precioVenta, int idProducto){
         boolean exito = false;
         try{
                String actualizarProductoSqlStatement = String.format("UPDATE producto SET precioVenta=%s, precioCosto=%s WHERE idProducto = %s", precioVenta, precioCosto, idProducto);
                PreparedStatement prdStmt  = cn.prepareStatement(actualizarProductoSqlStatement);
                prdStmt.execute();  
                JOptionPane.showMessageDialog(null,"Arqueo realizado con éxito");
                exito = true;
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"Error al actualizar producto"+e.getMessage());   
            }
         return exito;
     }
     
     }
    

