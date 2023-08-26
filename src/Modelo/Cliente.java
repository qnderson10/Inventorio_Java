/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Anderson
 */
public class Cliente {
    private int documento;
    private int codTipoDocument;
    private String nombreCompletoC;
    private String direccionC;
    private int codCiudadC;
    private String telefonoC;

    public Cliente() {
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCodTipoDocument() {
        return codTipoDocument;
    }

    public void setCodTipoDocument(int codTipoDocument) {
        this.codTipoDocument = codTipoDocument;
    }

    public String getNombreCompletoC() {
        return nombreCompletoC;
    }

    public void setNombreCompletoC(String nombreCompletoC) {
        this.nombreCompletoC = nombreCompletoC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public int getCodCiudadC() {
        return codCiudadC;
    }

    public void setCodCiudadC(int codCiudadC) {
        this.codCiudadC = codCiudadC;
    }

    public String getTelefonoC() {
        return telefonoC;
    }

    public void setTelefonoC(String telefonoC) {
        this.telefonoC = telefonoC;
    }

    @Override
    public String toString() {
        return  documento + ", " + codTipoDocument + ", " + nombreCompletoC + ", " + direccionC + ", " + codCiudadC + ", " + telefonoC;
    }
    
    
}
