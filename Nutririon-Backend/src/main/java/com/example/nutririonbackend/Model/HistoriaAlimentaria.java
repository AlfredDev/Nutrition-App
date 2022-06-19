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

public class HistoriaAlimentaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String horaLevantarse;
    private String horaAcostarse;
    private String tipoDieta;
    private String alimentoFavorito;
    private String alimentoRechazado;
    private String alergia;
    private String intoleranciaAlimentaria;
    private String deficienciasNutricionales;
    private String ingestaAgua;
    private String otraInformacion;

    public HistoriaAlimentaria(int id, String horaLevantarse, String horaAcostarse, String tipoDieta, String alimentoFavorito, String alimentoRechazado, String alergia, String intoleranciaAlimentaria, String deficienciasNutricionales, String ingestaAgua, String otraInformacion) {
        this.id = id;
        this.horaLevantarse = horaLevantarse;
        this.horaAcostarse = horaAcostarse;
        this.tipoDieta = tipoDieta;
        this.alimentoFavorito = alimentoFavorito;
        this.alimentoRechazado = alimentoRechazado;
        this.alergia = alergia;
        this.intoleranciaAlimentaria = intoleranciaAlimentaria;
        this.deficienciasNutricionales = deficienciasNutricionales;
        this.ingestaAgua = ingestaAgua;
        this.otraInformacion = otraInformacion;
    }

    public HistoriaAlimentaria() {
    }
}
