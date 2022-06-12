package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComposicionCorporal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float MasaGrasa;
    private float MasaMuscular;
    private float PorcentMasaGrasa;
    private float PorcentMasaMuscular;


    

    public ComposicionCorporal() {
    }

    public ComposicionCorporal(float masaGrasa, float masaMuscular, float porcentMasaGrasa, float porcentMasaMuscular) {
        MasaGrasa = masaGrasa;
        MasaMuscular = masaMuscular;
        PorcentMasaGrasa = porcentMasaGrasa;
        PorcentMasaMuscular = porcentMasaMuscular;
    }

    public float getMasaGrasa() {
        return MasaGrasa;
    }


    public void setMasaGrasa(float masaGrasa) {
        MasaGrasa = masaGrasa;
    }


    public float getMasaMuscular() {
        return MasaMuscular;
    }


    public void setMasaMuscular(float masaMuscular) {
        MasaMuscular = masaMuscular;
    }


    public float getPorcentMasaGrasa() {
        return PorcentMasaGrasa;
    }


    public void setPorcentMasaGrasa(float porcentMasaGrasa) {
        PorcentMasaGrasa = porcentMasaGrasa;
    }


    public float getPorcentMasaMuscular() {
        return PorcentMasaMuscular;
    }


    public void setPorcentMasaMuscular(float porcentMasaMuscular) {
        PorcentMasaMuscular = porcentMasaMuscular;
    }


    
    
}
