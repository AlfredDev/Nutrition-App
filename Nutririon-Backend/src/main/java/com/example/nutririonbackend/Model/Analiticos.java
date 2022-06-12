package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Analiticos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float ColHDL;
    private float ColLDL;
    private float ColTotal;
    private float PreDiastolica;
    private float PreSistolica;
    private float Trigliceridos;


    


    public Analiticos() {
    }


    public Analiticos(float colHDL, float colLDL, float colTotal, float preDiastolica, float preSistolica,
            float trigliceridos) {
        ColHDL = colHDL;
        ColLDL = colLDL;
        ColTotal = colTotal;
        PreDiastolica = preDiastolica;
        PreSistolica = preSistolica;
        Trigliceridos = trigliceridos;
    }


    public float getColHDL() {
        return ColHDL;
    }


    public void setColHDL(float colHDL) {
        ColHDL = colHDL;
    }


    public float getColLDL() {
        return ColLDL;
    }


    public void setColLDL(float colLDL) {
        ColLDL = colLDL;
    }


    public float getColTotal() {
        return ColTotal;
    }


    public void setColTotal(float colTotal) {
        ColTotal = colTotal;
    }


    public float getPreDiastolica() {
        return PreDiastolica;
    }


    public void setPreDiastolica(float preDiastolica) {
        PreDiastolica = preDiastolica;
    }


    public float getPreSistolica() {
        return PreSistolica;
    }


    public void setPreSistolica(float preSistolica) {
        PreSistolica = preSistolica;
    }


    public float getTrigliceridos() {
        return Trigliceridos;
    }


    public void setTrigliceridos(float trigliceridos) {
        Trigliceridos = trigliceridos;
    } 


    
    
}
