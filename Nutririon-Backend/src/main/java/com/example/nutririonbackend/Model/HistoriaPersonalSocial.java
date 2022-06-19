package com.example.nutririonbackend.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class HistoriaPersonalSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String funcionIntestinal;
    private String calidadSueño;
    private String fumador;
    private String bebeAlcohol;
    private String estadoCivil;
    private String actividadFisica;
    private  String otraInformacion;

    public HistoriaPersonalSocial(int id, String funcionIntestinal, String calidadSueño, String fumador, String bebeAlcohol, String estadoCivil, String actividadFisica, String otraInformacion) {
        this.id = id;
        this.funcionIntestinal = funcionIntestinal;
        this.calidadSueño = calidadSueño;
        this.fumador = fumador;
        this.bebeAlcohol = bebeAlcohol;
        this.estadoCivil = estadoCivil;
        this.actividadFisica = actividadFisica;
        this.otraInformacion = otraInformacion;
    }

    public HistoriaPersonalSocial(){}
}

