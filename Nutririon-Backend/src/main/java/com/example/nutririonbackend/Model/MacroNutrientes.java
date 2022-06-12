package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MacroNutrientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Energia;
    private String Grasa;
    private String HidratosCarbono;
    private String Proteinas;
    private String Colesterol;


    

    public MacroNutrientes() {
    }


    public MacroNutrientes(String energia, String grasa, String hidratosCarbono, String proteinas, String colesterol) {
        Energia = energia;
        Grasa = grasa;
        HidratosCarbono = hidratosCarbono;
        Proteinas = proteinas;
        Colesterol = colesterol;
    }


    public String getEnergia() {
        return Energia;
    }


    public void setEnergia(String energia) {
        Energia = energia;
    }


    public String getGrasa() {
        return Grasa;
    }


    public void setGrasa(String grasa) {
        Grasa = grasa;
    }


    public String getHidratosCarbono() {
        return HidratosCarbono;
    }


    public void setHidratosCarbono(String hidratosCarbono) {
        HidratosCarbono = hidratosCarbono;
    }


    public String getProteinas() {
        return Proteinas;
    }


    public void setProteinas(String proteinas) {
        Proteinas = proteinas;
    }


    public String getColesterol() {
        return Colesterol;
    }


    public void setColesterol(String colesterol) {
        Colesterol = colesterol;
    }
 
    

}
