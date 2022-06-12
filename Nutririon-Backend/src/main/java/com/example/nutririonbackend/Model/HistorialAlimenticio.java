package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistorialAlimenticio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Alergias;
    private String Intolerancia;
    private String DeficienciasNutri;
    private String IngestaAgua;
    private String InfoExtra;

    

    public HistorialAlimenticio() {
    }

    

    public HistorialAlimenticio(int id, String alergias, String intolerancia, String deficienciasNutri,
            String ingestaAgua, String infoExtra) {
        this.id = id;
        Alergias = alergias;
        Intolerancia = intolerancia;
        DeficienciasNutri = deficienciasNutri;
        IngestaAgua = ingestaAgua;
        InfoExtra = infoExtra;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String alergias) {
        Alergias = alergias;
    }

    public String getIntolerancia() {
        return Intolerancia;
    }

    public void setIntolerancia(String intolerancia) {
        Intolerancia = intolerancia;
    }

    public String getDeficienciasNutri() {
        return DeficienciasNutri;
    }

    public void setDeficienciasNutri(String deficienciasNutri) {
        DeficienciasNutri = deficienciasNutri;
    }

    public String getIngestaAgua() {
        return IngestaAgua;
    }

    public void setIngestaAgua(String ingestaAgua) {
        IngestaAgua = ingestaAgua;
    }

    public String getInfoExtra() {
        return InfoExtra;
    }

    public void setInfoExtra(String infoExtra) {
        InfoExtra = infoExtra;
    }

    


}
