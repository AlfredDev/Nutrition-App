package com.example.nutririonbackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PlanAlimenticio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Expediente IdExpediente;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Desayuno IdDesayuno;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private MediaManana IdMManana;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Comida IdComida;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Merienda IdMerienda;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Cena IdCena;

    public PlanAlimenticio(int id, Expediente idExpediente, Desayuno idDesayuno, MediaManana idMManana, Comida idComida,
            Merienda idMerienda, Cena idCena) {
        this.id = id;
        IdExpediente = idExpediente;
        IdDesayuno = idDesayuno;
        IdMManana = idMManana;
        IdComida = idComida;
        IdMerienda = idMerienda;
        IdCena = idCena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Expediente getIdExpediente() {
        return IdExpediente;
    }

    public void setIdExpediente(Expediente idExpediente) {
        IdExpediente = idExpediente;
    }

    public Desayuno getIdDesayuno() {
        return IdDesayuno;
    }

    public void setIdDesayuno(Desayuno idDesayuno) {
        IdDesayuno = idDesayuno;
    }

    public MediaManana getIdMManana() {
        return IdMManana;
    }

    public void setIdMManana(MediaManana idMManana) {
        IdMManana = idMManana;
    }

    public Comida getIdComida() {
        return IdComida;
    }

    public void setIdComida(Comida idComida) {
        IdComida = idComida;
    }

    public Merienda getIdMerienda() {
        return IdMerienda;
    }

    public void setIdMerienda(Merienda idMerienda) {
        IdMerienda = idMerienda;
    }

    public Cena getIdCena() {
        return IdCena;
    }

    public void setIdCena(Cena idCena) {
        IdCena = idCena;
    }


    
    
}
