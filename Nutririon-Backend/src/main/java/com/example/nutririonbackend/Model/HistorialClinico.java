package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistorialClinico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Patologias;
    private String Medicacion;
    private String AntecedenPersonales;
    private String AntecedenFamiliares;
    private String InfoExtra;

    


    public HistorialClinico() {
    }


    


    public HistorialClinico(int id, String patologias, String medicacion, String antecedenPersonales,
            String antecedenFamiliares, String infoExtra) {
        this.id = id;
        Patologias = patologias;
        Medicacion = medicacion;
        AntecedenPersonales = antecedenPersonales;
        AntecedenFamiliares = antecedenFamiliares;
        InfoExtra = infoExtra;
    }





    public int getId() {
        return id;
    }





    public void setId(int id) {
        this.id = id;
    }





    public String getPatologias() {
        return Patologias;
    }


    public void setPatologias(String patologias) {
        Patologias = patologias;
    }


    public String getMedicacion() {
        return Medicacion;
    }


    public void setMedicacion(String medicacion) {
        Medicacion = medicacion;
    }


    public String getAntecedenPersonales() {
        return AntecedenPersonales;
    }


    public void setAntecedenPersonales(String antecedenPersonales) {
        AntecedenPersonales = antecedenPersonales;
    }


    public String getAntecedenFamiliares() {
        return AntecedenFamiliares;
    }


    public void setAntecedenFamiliares(String antecedenFamiliares) {
        AntecedenFamiliares = antecedenFamiliares;
    }


    public String getInfoExtra() {
        return InfoExtra;
    }


    public void setInfoExtra(String infoExtra) {
        InfoExtra = infoExtra;
    }

    
    
}
