/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Compra;
import Modelo.FormaPago;
import Modelo.Producto;
import Modelo.Proveedor;
import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANDRES
 */
public class control_existencias 
{
     private Sentencias_sql sen;
     private String Documento;
     private  String numero_factura="";
     private conexionSQL cc = new conexionSQL();  
     private Connection cn = cc.conexion();

     
    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getId_cliente() {
        return Documento;
    }

    public void setId_cliente(String id_cliente) {
        this.Documento = Documento;
    }
     private String No_documento;

    public String getId_proveedor() {
        return No_documento;
    }

    public void setId_proveedor(String id_proveedor) {
        this.No_documento = No_documento;
    }

    public String getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }
     private String id_articulo;
     
     public control_existencias()
     {
         sen = new Sentencias_sql();
     }
     
     public void insertarClienteNuevo(Cliente cliente){
         String[] datos = {cliente.getDocumento()+"",cliente.getCodTipoDocument()+"", cliente.getNombreCompletoC(), cliente.getDireccionC(), cliente.getCodCiudadC()+"", cliente.getTelefonoC()};
         if(existe_validacion(cliente.getDocumento()+"", "cliente", "documento") != false){
             JOptionPane.showMessageDialog(null,"Error, el cliente ya existe");
         }
         else{
             sen.insertar(datos, "insert into cliente (documento,codTipoDocument,nombreCompletoC,direccionC,codCiudadC,telefonoC) Values (?,?,?,?,?,?)");
             JOptionPane.showMessageDialog(null,"Cliente registrado");
         }
     }
     public void insertarProveedorNuevo(Proveedor proveedor){
         String[] datos = {proveedor.getNumeroDocumento()+"",proveedor.getCodTipoDocumento()+"", proveedor.getNombreCompleto(), proveedor.getNombreComercial(), proveedor.getDireccion(), proveedor.getCodCiudad()+"", proveedor.getTelefono()};
         if(existe_validacion(proveedor.getNumeroDocumento()+"", "proveedor", "numeroDocumento") == false){
            sen.insertar(datos, "insert into proveedor ( numeroDocumento, codTipoDocumento, nombreCompleto, nombreComercial, direccion, codCiudad, Telefono) Values (?,?,?,?,?,?,?)");
            JOptionPane.showMessageDialog(null,"Proveedor registrado");
         }
         else{
             JOptionPane.showMessageDialog(null,"Error, el proveedor ya existe");
         }
     }
     
     public void insertarProductoNuevo(Producto producto){
         String[] datos = {producto.getDescripcion(),producto.getPrecioVenta()+"", producto.getPrecioCosto()+"", producto.getStock()+"", producto.getCodigoTipoProducto()+"", producto.getCodigoProveedor()+"", producto.getFechaIngreso()};
         sen.insertar(datos, "insert into producto (descripcion,precioVenta,precioCosto,stock,codigoTipoProducto,codigoProveedor,fechaIngreso) Values (?,?,?,?,?,?,?)");
         JOptionPane.showMessageDialog(null,"Producto registrado");
     }
     public boolean existe_validacion( String cod, String tabla, String columna)
     {
         
        this.Documento = cod;
        return sen.existencias(cod, " from " + tabla + " where " + columna + "='"+cod+"';");
      
    }
     public String ingresa_nombreCompleto_Cliente()
     { 
       String result;
       result = sen.datos_string("nombres", "select nombres from cliente where Documento='"+this.Documento+"';");
       return result;
    }
   
     public String GenerarNumeroFactura()
     {
        String codigo = "FACT-";
        for(int i=1; i<=6;i++){
           int num = (int)((Math.random()*(5))+6);
           codigo = codigo +  num;
        }
        numero_factura = codigo;
        return codigo;
    }
     public void registrar_factura(String[] factura, boolean compra)
     {
        if(compra == true){
            sen.insertar(factura, "insert into compra(numFacturaCompra, numeroDocumentoProveedor, codProducto, cantidad, fechaFacturacionCompra, totalFactura, codFormaPago) values(?,?,?,?,?,?,?);");
        }
        else{
            sen.insertar(factura, "insert into venta(numFactura, codCliente, codProducto, cantidad, nombreEmpledo, fecha_facturacion, codFormaPago, totalFactura) values(?,?,?,?,?,?,?,?);");
        }

//
        
    }

      public boolean update_factura(String factura, String total, String iva)
      {
          String campos[] = {total, iva,factura};           
          return sen.insertar(campos, "update factura set total_factura=?, IVA=? where Nnm_factura=?;");
      
      }
      
      public boolean update_stock(String stock, String id_articulo)
      {
          String campos[] = {stock,id_articulo};           
          return sen.insertar(campos, "update articulo set stock=stock+? where id_articulo=?;");
      
      }
     
     
     public void combox(JComboBox cb, String tabla, String nombreCol)
     {
        sen.poblar_combox(cb, tabla, nombreCol);
     }
     
     public Object[][] datos_articulo(String idProducto)
     {
        String[] columnas={"descripcion","precioVenta","stock"};
        Object[][] resultado = sen.GetTabla(columnas, "producto", "select descripcion, precioVenta, stock from producto where idProducto='"+idProducto+"';");
        return resultado;
      }
     
     public Object[][] datos_cliente(String id_cliente)
     {
        String[] columnas={"Documento","codTipoDocumento","NombreCompleto","Direccion","Nombre_ciudad","Telefono"};
        Object[][] resultado = sen.GetTabla(columnas, "cliente", "select * from cliente, ciudad, tipodocumento where idTipoDocumento=codTipoDocumentoC and codigoCiudad=CodCiudadCand documento='"+id_cliente+"';");
        return resultado;
      }
      public Object[][] datos_detallefactura(String numero_factura)
     {
        String[] columnas={"numFactura","codProducto","descripcion","cantidad","totalFactura"};
        Object[][] resultado = sen.GetTabla(columnas, "venta where numFactura='"+numero_factura+"';", "select * from venta,Producto where idProducto = codProducto and numFactura='"+numero_factura+"';");
        return resultado;
      }
      
     /** public Object[][] consulta_factura(String id)
       {
        String[] columnas={"Nnm_factura","Nombres","Apellidos","Nombre_empleado","Fecha_facturacion","Descripcion_formapago","total_factura","IVA"};
        Object[][] resultado = sen.GetTabla(columnas, "cliente", "select * from cliente, factura, forma_de_pago where documento=cod_cliente and cod_formapago=id_formapago and documento='"+id+"';");
        return resultado;
       }
       *
     *
     * @return  **/
        
        public Double total_factura(String numfact)
        {
        return sen.datos_totalfactura("totalFactura", "select round( sum( totalFactura ) , 2 ) as total from venta, compra where numFactura='"+numfact+"' and numFacturaCompra = '"+numfact+"';");
    }
        public String obtenerFecha(){
            Date hoy = new Date();
            String fecha = hoy.getDate()+"/"+(hoy.getMonth()+1) +"/"+(hoy.getYear()+1900);
            return fecha;
        }
        
        public void generarFacturaCompra(int formaPago, int documentoProveedor, String fecha, int cantidadValue, int idProducto, JTextField jt, JTextField vt){
            try{
                control_existencias con = new control_existencias();
                con.GenerarNumeroFactura();
                String numFac = con.getNumero_factura();
                ResultSet resultado = sen.buscarProducto(idProducto);
                Producto producto = con.resultSetToProducto(resultado);
                double totalFactura = cantidadValue*producto.getPrecioCosto();
                jt.setText(""+totalFactura);
                vt.setText(numFac);
                int newStock = producto.getStock() + cantidadValue;
                String[] factura = {numFac, documentoProveedor+"", idProducto+"", cantidadValue+"", fecha, totalFactura+"", formaPago+""};
                con.registrar_factura(factura, true);
                sen.actualizarStockProducto(newStock+"", idProducto);
                JOptionPane.showMessageDialog(null,"La factura se realizó exitosamente");  
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"Error al facturar"+e.getMessage());   
            }

        }
        
        public void generarFacturaVenta(int codCliente, String nombreEmpleado, int formaPago, String fecha, int cantidadValue, int idProducto, JTextField jt, JTextField vt){
            try{
                control_existencias con = new control_existencias();
                con.GenerarNumeroFactura();
                String numFac = con.getNumero_factura();
                ResultSet resultado = sen.buscarProducto(idProducto);
                Producto producto = con.resultSetToProducto(resultado);
                double totalFactura = cantidadValue*producto.getPrecioVenta();
                jt.setText(""+totalFactura);
                int newStock = producto.getStock() - cantidadValue;
                if(newStock >= 0){
                    String[] factura = {numFac, codCliente+"", idProducto+"", cantidadValue+"", nombreEmpleado, fecha, formaPago+"", totalFactura+""};
                    con.registrar_factura(factura, false);
                    sen.actualizarStockProducto(newStock+"", idProducto);
                    vt.setText(numFac);
                    JOptionPane.showMessageDialog(null,"La factura se realizó exitosamente");
                }
                else{
                    JOptionPane.showMessageDialog(null,"No hay suficientes productos en stock para vender, el stock disponible es " + producto.getStock());
                }  
            }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Error al facturar"+e.getMessage());   
            }

        }
        
        public Producto resultSetToProducto(ResultSet resultado){
            Producto producto = new Producto(); 
            try{
                resultado.next();
                producto.setDescripcion(resultado.getString("descripcion"));
                producto.setPrecioVenta(resultado.getDouble("precioVenta"));
                producto.setPrecioCosto(resultado.getDouble("precioCosto"));
                producto.setStock(resultado.getInt("stock"));
                producto.setCodigoTipoProducto(resultado.getInt("codigoTipoProducto"));
                producto.setCodigoProveedor(resultado.getInt("codigoProveedor"));
                producto.setFechaIngreso(resultado.getString("fechaIngreso"));
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"Error al resolver el producto"+e.getMessage());   
            }
         return producto;
            
        }
        
        public DefaultTableModel mostrarDatos(DefaultTableModel tb, String tabla, String id, String columna, boolean busqueda, int m){
            String []datos = new String[8];
        
        try {
            Statement leer = cn.createStatement();
            if(busqueda == false){
                ResultSet res = leer.executeQuery("SELECT * FROM " + tabla);
            
                while(res.next()){
                    datos[0] = res.getString(1);
                    datos[1] = res.getString(2);
                    datos[2] = res.getString(3);
                    datos[3] = res.getString(4);
                    datos[4] = res.getString(5);
                    datos[5] = res.getString(6);
                    if(m>1){
                        datos[6] = res.getString(7);
                        tb.addRow(datos);
                    }
                    else if(m>2){
                        datos[6] = res.getString(7);
                        datos[7] = res.getString(8);
                        tb.addRow(datos);
                    }
                    else{
                        tb.addRow(datos);
                    }
                }
            }
            else{
                String SQL = "SELECT * FROM " + tabla + " WHERE %s = " + columna;
                String sqlStatement = String.format(SQL, id);
                ResultSet res = leer.executeQuery(sqlStatement);
                while(res.next()){
                    datos[0] = res.getString(1);
                    datos[1] = res.getString(2);
                    datos[2] = res.getString(3);
                    datos[3] = res.getString(4);
                    datos[4] = res.getString(5);
                    datos[5] = res.getString(6);
                    if(m>1){
                        datos[6] = res.getString(7);
                        tb.addRow(datos);
                    }
                    else if(m>2){
                        datos[6] = res.getString(7);
                        datos[7] = res.getString(8);
                        tb.addRow(datos);
                    }
                    else{
                        tb.addRow(datos);
                    }
                }
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
        return tb;
        }
        
        public boolean realizarArqueo(int idProducto, double newCosto, int cantidad) {
            boolean exito;
            control_existencias con = new control_existencias();
            ResultSet resultado = sen.buscarProducto(idProducto);
            Producto producto = con.resultSetToProducto(resultado);
            int oldStock = producto.getStock() - cantidad;
            if(oldStock >= 1){
                double valorOld = oldStock*producto.getPrecioCosto();
                double valorNew = cantidad*newCosto;
                double newCostoA = (valorOld+valorNew)/producto.getStock();
                double newPVenta = newCostoA*1.1;
                exito = sen.actualizarPreciosProducto(newCostoA, newPVenta, idProducto);
                return exito;
            }
            else if(oldStock == 0){
                double newPVenta = newCosto*1.1;
                exito = sen.actualizarPreciosProducto(newCosto, newPVenta, idProducto);
                return exito;
            }
            else{
                exito = false;
                JOptionPane.showMessageDialog(null,"Error, la cantidad de productos a realizar arqueo es mayor al stock del producto");
                return exito;
            }
            
       
        }
        public int getIdFromResultSetProducto(ResultSet resultado){
                
                int idProducto = 0;
                try {
                    resultado.next();
                    idProducto = resultado.getInt("idProducto");
                } catch (SQLException ex) {
                    Logger.getLogger(control_existencias.class.getName()).log(Level.SEVERE, null, ex);
                }
                return idProducto;
            }
    }     
