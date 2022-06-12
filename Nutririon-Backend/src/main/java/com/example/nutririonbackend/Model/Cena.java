package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public classCena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Alimento; 

    publicCena() {
    }

    publicCena(String alimento) {
        Alimento = alimento;
    }


    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String alimento) {
        Alimento = alimento;
    }  
}