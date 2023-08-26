/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author useer
 */
public class FacturacionCompraMemento {
    private String fechaFacturacionCompra;
    private String valorTotal;
    private String documentoProveedor;
    private String productos;

    public FacturacionCompraMemento(String fechaFacturacionCompra, String valorTotal, String documentoProveedor, String productos) {
        this.fechaFacturacionCompra = fechaFacturacionCompra;
        this.valorTotal = valorTotal;
        this.documentoProveedor = documentoProveedor;
        this.productos = productos;
    }

    public String getFechaFacturacionCompra() {
        return fechaFacturacionCompra;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public String getDocumentoProveedor() {
        return documentoProveedor;
    }

    public String getProductos() {
        return productos;
    }
}
