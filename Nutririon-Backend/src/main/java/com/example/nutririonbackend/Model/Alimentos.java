package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private int Cantidad;
    private String Energia;
    private float Grasa;
    private float HidratoDeCarbono;
    private float Proteinas;
    private float Colesterol;

    public Alimentos() {
    }

    public Alimentos(String nombre, int cantidad, String energia, float grasa,
            float hidratoDeCarbono, float proteinas, float colesterol) {
        Nombre = nombre;
        Cantidad = cantidad;
        Energia = energia;
        Grasa = grasa;
        HidratoDeCarbono = hidratoDeCarbono;
        Proteinas = proteinas;
        Colesterol = colesterol;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getEnergia() {
        return Energia;
    }

    public void setEnergia(String energia) {
        Energia = energia;
    }

    public float getGrasa() {
        return Grasa;
    }

    public void setGrasa(float grasa) {
        Grasa = grasa;
    }

    public float getHidratoDeCarbono() {
        return HidratoDeCarbono;
    }

    public void setHidratoDeCarbono(float hidratoDeCarbono) {
        HidratoDeCarbono = hidratoDeCarbono;
    }

    public float getProteinas() {
        return Proteinas;
    }

    public void setProteinas(float proteinas) {
        Proteinas = proteinas;
    }

    public float getColesterol() {
        return Colesterol;
    }

    public void setColesterol(float colesterol) {
        Colesterol = colesterol;
    }  

    
    
}
