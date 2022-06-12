package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float PesoActual;
    private float PesoIdeal;
    private float GrasaCorporal;
    private float GrasaCorporalIdeal;
    private float IndiceMasaCorporal;
    private float IndiceMasaCorporalIdeal;
    private float NivelActivFisica;
    private float NivelActivFisicaIdeal;

    

    public Planificacion() {
    }

    public Planificacion(float pesoActual, float pesoIdeal, float grasaCorporal, float grasaCorporalIdeal,
            float indiceMasaCorporal, float indiceMasaCorporalIdeal, float nivelActivFisica,
            float nivelActivFisicaIdeal) {
        PesoActual = pesoActual;
        PesoIdeal = pesoIdeal;
        GrasaCorporal = grasaCorporal;
        GrasaCorporalIdeal = grasaCorporalIdeal;
        IndiceMasaCorporal = indiceMasaCorporal;
        IndiceMasaCorporalIdeal = indiceMasaCorporalIdeal;
        NivelActivFisica = nivelActivFisica;
        NivelActivFisicaIdeal = nivelActivFisicaIdeal;
    }

    public float getPesoActual() {
        return PesoActual;
    }

    public void setPesoActual(float pesoActual) {
        PesoActual = pesoActual;
    }

    public float getPesoIdeal() {
        return PesoIdeal;
    }

    public void setPesoIdeal(float pesoIdeal) {
        PesoIdeal = pesoIdeal;
    }

    public float getGrasaCorporal() {
        return GrasaCorporal;
    }

    public void setGrasaCorporal(float grasaCorporal) {
        GrasaCorporal = grasaCorporal;
    }

    public float getGrasaCorporalIdeal() {
        return GrasaCorporalIdeal;
    }

    public void setGrasaCorporalIdeal(float grasaCorporalIdeal) {
        GrasaCorporalIdeal = grasaCorporalIdeal;
    }

    public float getIndiceMasaCorporal() {
        return IndiceMasaCorporal;
    }

    public void setIndiceMasaCorporal(float indiceMasaCorporal) {
        IndiceMasaCorporal = indiceMasaCorporal;
    }

    public float getIndiceMasaCorporalIdeal() {
        return IndiceMasaCorporalIdeal;
    }

    public void setIndiceMasaCorporalIdeal(float indiceMasaCorporalIdeal) {
        IndiceMasaCorporalIdeal = indiceMasaCorporalIdeal;
    }

    public float getNivelActivFisica() {
        return NivelActivFisica;
    }

    public void setNivelActivFisica(float nivelActivFisica) {
        NivelActivFisica = nivelActivFisica;
    }

    public float getNivelActivFisicaIdeal() {
        return NivelActivFisicaIdeal;
    }

    public void setNivelActivFisicaIdeal(float nivelActivFisicaIdeal) {
        NivelActivFisicaIdeal = nivelActivFisicaIdeal;
    }
    

    
    
    
}
