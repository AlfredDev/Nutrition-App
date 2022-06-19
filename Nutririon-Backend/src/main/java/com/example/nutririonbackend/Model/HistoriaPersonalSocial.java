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

    private String patalogias;
    private String medicacion;
    private String antecedentePersonal;
    private String antecedenteFamiliar;
    private String otraInformacion;

    public HistoriaPersonalSocial(int id, String patalogias, String medicacion, String antecedentePersonal, String antecedenteFamiliar, String otraInformacion) {
        this.id = id;
        this.patalogias = patalogias;
        this.medicacion = medicacion;
        this.antecedentePersonal = antecedentePersonal;
        this.antecedenteFamiliar = antecedenteFamiliar;
        this.otraInformacion = otraInformacion;
    }

    public HistoriaPersonalSocial() {
    }
}
