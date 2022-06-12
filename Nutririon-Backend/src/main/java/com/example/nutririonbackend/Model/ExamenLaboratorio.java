package com.example.nutririonbackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.crypto.Data;

@Entity
public class ExamenLaboratorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Expediente IDExpediente;
    private Data Fecha;
    private String Descripcion;
    private String NombreExamenes;
    private String OtrosExamenes;   
    

    public ExamenLaboratorio() {
    }

    public ExamenLaboratorio(Data fecha, String descripcion, String nombreExamenes, String otrosExamenes,
            Expediente iDExpediente) {
        Fecha = fecha;
        Descripcion = descripcion;
        NombreExamenes = nombreExamenes;
        OtrosExamenes = otrosExamenes;
        IDExpediente = iDExpediente;
    }

    public Data getFecha() {
        return Fecha;
    }

    public void setFecha(Data fecha) {
        Fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNombreExamenes() {
        return NombreExamenes;
    }

    public void setNombreExamenes(String nombreExamenes) {
        NombreExamenes = nombreExamenes;
    }

    public String getOtrosExamenes() {
        return OtrosExamenes;
    }

    public void setOtrosExamenes(String otrosExamenes) {
        OtrosExamenes = otrosExamenes;
    }

    public Expediente getIDExpediente() {
        return IDExpediente;
    }

    public void setIDExpediente(Expediente iDExpediente) {
        IDExpediente = iDExpediente;
    }



    
}
