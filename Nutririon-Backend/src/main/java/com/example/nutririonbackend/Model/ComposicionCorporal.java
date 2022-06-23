package com.example.nutririonbackend.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ComposicionCorporal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  double masaGrasa;
    private double masaMuscular;
    private double porcentajeMasaGrasa;
    private  double porcentajeMasaMuscular;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date fecha_registro;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "expediente_F_K", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Expediente expediente;

    public ComposicionCorporal(int id, double masaGrasa, double masaMuscular, double porcentajeMasaGrasa, double porcentajeMasaMuscular, Date fecha_registro) {
        this.id = id;
        this.masaGrasa = masaGrasa;
        this.masaMuscular = masaMuscular;
        this.porcentajeMasaGrasa = porcentajeMasaGrasa;
        this.porcentajeMasaMuscular = porcentajeMasaMuscular;
        this.fecha_registro = fecha_registro;
    }

    public ComposicionCorporal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMasaGrasa() {
        return masaGrasa;
    }

    public void setMasaGrasa(double masaGrasa) {
        this.masaGrasa = masaGrasa;
    }

    public double getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(double masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public double getPorcentajeMasaGrasa() {
        return porcentajeMasaGrasa;
    }

    public void setPorcentajeMasaGrasa(double porcentajeMasaGrasa) {
        this.porcentajeMasaGrasa = porcentajeMasaGrasa;
    }

    public double getPorcentajeMasaMuscular() {
        return porcentajeMasaMuscular;
    }

    public void setPorcentajeMasaMuscular(double porcentajeMasaMuscular) {
        this.porcentajeMasaMuscular = porcentajeMasaMuscular;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
}
