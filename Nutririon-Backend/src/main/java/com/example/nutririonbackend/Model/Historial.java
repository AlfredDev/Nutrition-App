package com.example.nutririonbackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String CalidadSueño;
    private boolean Fumador;
    private boolean BebeAlcohol;
    private String EstadoCivil;

    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private HistorialAlimenticio IDHistorialAlim;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private HistorialClinico IDHistorialClinic;

    public Historial() {
    }

    public Historial(int id, String calidadSueño, boolean fumador, boolean bebeAlcohol, String estadoCivil,
            HistorialAlimenticio iDHistorialAlim, HistorialClinico iDHistorialClinic) {
        this.id = id;
        CalidadSueño = calidadSueño;
        Fumador = fumador;
        BebeAlcohol = bebeAlcohol;
        EstadoCivil = estadoCivil;
        IDHistorialAlim = iDHistorialAlim;
        IDHistorialClinic = iDHistorialClinic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalidadSueño() {
        return CalidadSueño;
    }

    public void setCalidadSueño(String calidadSueño) {
        CalidadSueño = calidadSueño;
    }

    public boolean isFumador() {
        return Fumador;
    }

    public void setFumador(boolean fumador) {
        Fumador = fumador;
    }

    public boolean isBebeAlcohol() {
        return BebeAlcohol;
    }

    public void setBebeAlcohol(boolean bebeAlcohol) {
        BebeAlcohol = bebeAlcohol;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public HistorialAlimenticio getIDHistorialAlim() {
        return IDHistorialAlim;
    }

    public void setIDHistorialAlim(HistorialAlimenticio iDHistorialAlim) {
        IDHistorialAlim = iDHistorialAlim;
    }

    public HistorialClinico getIDHistorialClinic() {
        return IDHistorialClinic;
    }

    public void setIDHistorialClinic(HistorialClinico iDHistorialClinic) {
        IDHistorialClinic = iDHistorialClinic;
    }



    

    
}
