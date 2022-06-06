package com.example.nutririonbackend.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;

@Entity

public class DireccionPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDatos;
    private String LugarConsulta;
    private String PaisResidencia;
    private String CodigoPostal;
    private String telefono;
    private String Correo;
    private Date incorporacion;

    public Date getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(Date incorporacion) {
        this.incorporacion = incorporacion;
    }

    public DireccionPaciente() {
    }

    public DireccionPaciente(int idDatos, String lugarConsulta, String paisResidencia, String codigoPostal, String telefono, String correo, Paciente paciente) {
        this.idDatos = idDatos;
        LugarConsulta = lugarConsulta;
        PaisResidencia = paisResidencia;
        CodigoPostal = codigoPostal;
        this.telefono = telefono;
        Correo = correo;
        incorporacion = new Date();
    }

    public int getIdDatos() {
        return idDatos;
    }

    public void setIdDatos(int idDatos) {
        this.idDatos = idDatos;
    }

    public String getLugarConsulta() {
        return LugarConsulta;
    }

    public void setLugarConsulta(String lugarConsulta) {
        LugarConsulta = lugarConsulta;
    }

    public String getPaisResidencia() {
        return PaisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        PaisResidencia = paisResidencia;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }


}