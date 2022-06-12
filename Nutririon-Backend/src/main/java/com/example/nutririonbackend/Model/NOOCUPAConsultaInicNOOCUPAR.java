package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NOOCUPAConsultaInicNOOCUPAR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Motivo;
    private String Expectativa;
    private String ObjetivoClinico;
    private String OtraInfo;
    private String Observaciones;
    private String ComporAlimenticio;

    

    public NOOCUPAConsultaInicNOOCUPAR() {
    }


    public NOOCUPAConsultaInicNOOCUPAR(String motivo, String expectativa, String objetivoClinico, String otraInfo,
            String observaciones, String comporAlimenticio) {
        Motivo = motivo;
        Expectativa = expectativa;
        ObjetivoClinico = objetivoClinico;
        OtraInfo = otraInfo;
        Observaciones = observaciones;
        ComporAlimenticio = comporAlimenticio;
    }


    public String getMotivo() {
        return Motivo;
    }


    public void setMotivo(String motivo) {
        Motivo = motivo;
    }


    public String getExpectativa() {
        return Expectativa;
    }


    public void setExpectativa(String expectativa) {
        Expectativa = expectativa;
    }


    public String getObjetivoClinico() {
        return ObjetivoClinico;
    }


    public void setObjetivoClinico(String objetivoClinico) {
        ObjetivoClinico = objetivoClinico;
    }


    public String getOtraInfo() {
        return OtraInfo;
    }


    public void setOtraInfo(String otraInfo) {
        OtraInfo = otraInfo;
    }


    public String getObservaciones() {
        return Observaciones;
    }


    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }


    public String getComporAlimenticio() {
        return ComporAlimenticio;
    }


    public void setComporAlimenticio(String comporAlimenticio) {
        ComporAlimenticio = comporAlimenticio;
    }  

    


    
}
