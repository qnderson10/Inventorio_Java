/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson
 */
public class Compra {
    private int numFacturaCompra;
    private Proveedor proveedor;
    private List<Producto> codProductos;
    private int cantidad;
    private String fechaFacturacionCompra;
    private double totalFactura;
    private FormaPago formaPago;

    public Compra() {
        this.codProductos = new ArrayList<>();
    }

    public int getNumFacturaCompra() {
        return numFacturaCompra;
    }

    public void setNumFacturaCompra(int numFacturaCompra) {
        this.numFacturaCompra = numFacturaCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Producto> getCodProductos() {
        return codProductos;
    }

    public void setCodProductos(List<Producto> codProductos) {
        this.codProductos = codProductos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaFacturacionCompra() {
        return fechaFacturacionCompra;
    }

    public void setFechaFacturacionCompra(String fechaFacturacionCompra) {
        this.fechaFacturacionCompra = fechaFacturacionCompra;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Compra{" + "numFacturaCompra=" + numFacturaCompra + ", proveedor=" + proveedor + ", codProductos=" + codProductos + ", cantidad=" + cantidad + ", fechaFacturacionCompra=" + fechaFacturacionCompra + ", totalFactura=" + totalFactura + ", formaPago=" + formaPago + '}';
    }
    
    
}
