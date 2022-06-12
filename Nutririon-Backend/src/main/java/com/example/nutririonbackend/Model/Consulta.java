package com.example.nutririonbackend.Model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date IniConsulta;
    private Date FinConsulta;
    private String Estado;
    private String LConsulta;
    private String Cliente;
    private String VdoConferen;


    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Paciente IDpaciente;

    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Expediente IDExpediente;

    


    public Consulta() {
    }


    public Consulta(Date iniConsulta, Date finConsulta, String estado, String lConsulta, String cliente,
            String vdoConferen, Paciente iDpaciente, Expediente iDExpediente) {
        IniConsulta = iniConsulta;
        FinConsulta = finConsulta;
        Estado = estado;
        LConsulta = lConsulta;
        Cliente = cliente;
        VdoConferen = vdoConferen;
        IDpaciente = iDpaciente;
        IDExpediente = iDExpediente;
    }


    public Date getIniConsulta() {
        return IniConsulta;
    }


    public void setIniConsulta(Date iniConsulta) {
        IniConsulta = iniConsulta;
    }


    public Date getFinConsulta() {
        return FinConsulta;
    }


    public void setFinConsulta(Date finConsulta) {
        FinConsulta = finConsulta;
    }


    public String getEstado() {
        return Estado;
    }


    public void setEstado(String estado) {
        Estado = estado;
    }


    public String getLConsulta() {
        return LConsulta;
    }


    public void setLConsulta(String lConsulta) {
        LConsulta = lConsulta;
    }


    public String getCliente() {
        return Cliente;
    }


    public void setCliente(String cliente) {
        Cliente = cliente;
    }


    public String getVdoConferen() {
        return VdoConferen;
    }


    public void setVdoConferen(String vdoConferen) {
        VdoConferen = vdoConferen;
    }


    public Paciente getIDpaciente() {
        return IDpaciente;
    }


    public void setIDpaciente(Paciente iDpaciente) {
        IDpaciente = iDpaciente;
    }


    public Expediente getIDExpediente() {
        return IDExpediente;
    }


    public void setIDExpediente(Expediente iDExpediente) {
        IDExpediente = iDExpediente;
    }


    
    


    
}
