/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.PreparedStatement;

/**
 *
 * @author Fernanda
 */
public class Venta {
    String numFatura;
    int codCliente;
    String nombreEmpleado;
    String FechaFact;
    int formaPago;
    String totalFact;
    int idProducto;
    int cantidad;

    public Venta() {
    }

    public Venta(int codCliente, int formaPago, int idProducto) {
        this.codCliente = codCliente;
        this.formaPago = formaPago;
        this.idProducto = idProducto;
    }
    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNumFatura() {
        return numFatura;
    }

    public void setNumFatura(String numFatura) {
        this.numFatura = numFatura;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getFechaFact() {
        return FechaFact;
    }

    public void setFechaFact(String FechaFact) {
        this.FechaFact = FechaFact;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public String getTotalFact() {
        return totalFact;
    }

    public void setTotalFact(String totalFact) {
        this.totalFact = totalFact;
    }
 
    public String GenerarNumeroFactura()
     {
        String codigo = "FACT-";
        for(int i=1; i<=6;i++){
           int num = (int)((Math.random()*(5))+6);
           codigo = codigo  +  num;
        }
        numFatura = codigo;
        return codigo;
    }

    @Override
    public String toString() {
        return "Venta{" + "numFatura=" + numFatura + ", codCliente=" + codCliente + ", nombreEmpleado=" + nombreEmpleado + ", FechaFact=" + FechaFact + ", formaPago=" + formaPago + ", totalFact=" + totalFact + ", idProducto=" + idProducto + ", cantidad=" + cantidad + '}';
    }
    
}
