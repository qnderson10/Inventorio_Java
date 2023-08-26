/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Anderson
 */
public class Proveedor {
    private int numeroDocumento;
    private int codTipoDocumento;
    private String nombreCompleto;
    private String nombreComercial;
    private String direccion;
    private int codCiudad;
    private String telefono;

    public Proveedor() {
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(int codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "numeroDocumento=" + numeroDocumento + ", codTipoDocumento=" + codTipoDocumento + ", nombreCompleto=" + nombreCompleto + ", nombreComercial=" + nombreComercial + ", direccion=" + direccion + ", codCiudad=" + codCiudad + ", telefono=" + telefono + '}';
    }

    
}
