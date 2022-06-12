package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActividadFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float Tiempo;
    private int VCPSemana;
    private String Nombre;


    

    public ActividadFisica() {
    }


    public ActividadFisica(float tiempo, int vCPSemana, String nombre) {
        Tiempo = tiempo;
        VCPSemana = vCPSemana;
        Nombre = nombre;
    }


    public float getTiempo() {
        return Tiempo;
    }


    public void setTiempo(float tiempo) {
        Tiempo = tiempo;
    }


    public int getVCPSemana() {
        return VCPSemana;
    }


    public void setVCPSemana(int vCPSemana) {
        VCPSemana = vCPSemana;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }  

    

    
}
