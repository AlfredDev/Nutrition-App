package com.example.nutririonbackend.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DatosAnaliticos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double HDLcolesterol;
    private double LDLcolesterol;
    private double colesterolTotal;
    private double presionDiastolica;
    private double presionSistolica;
    private double trigliceridos;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date fecha_registro;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "expediente_FK", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Expediente expediente;

    public DatosAnaliticos(int id, double HDLcolesterol, double LDLcolesterol, double colesterolTotal, double presionDiastolica, double presionSistolica, double trigliceridos, Date fecha_registro) {
        this.id = id;
        this.HDLcolesterol = HDLcolesterol;
        this.LDLcolesterol = LDLcolesterol;
        this.colesterolTotal = colesterolTotal;
        this.presionDiastolica = presionDiastolica;
        this.presionSistolica = presionSistolica;
        this.trigliceridos = trigliceridos;
        this.fecha_registro = fecha_registro;
    }

    public DatosAnaliticos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHDLcolesterol() {
        return HDLcolesterol;
    }

    public void setHDLcolesterol(double HDLcolesterol) {
        this.HDLcolesterol = HDLcolesterol;
    }

    public double getLDLcolesterol() {
        return LDLcolesterol;
    }

    public void setLDLcolesterol(double LDLcolesterol) {
        this.LDLcolesterol = LDLcolesterol;
    }

    public double getColesterolTotal() {
        return colesterolTotal;
    }

    public void setColesterolTotal(double colesterolTotal) {
        this.colesterolTotal = colesterolTotal;
    }

    public double getPresionDiastolica() {
        return presionDiastolica;
    }

    public void setPresionDiastolica(double presionDiastolica) {
        this.presionDiastolica = presionDiastolica;
    }

    public double getPresionSistolica() {
        return presionSistolica;
    }

    public void setPresionSistolica(double presionSistolica) {
        this.presionSistolica = presionSistolica;
    }

    public double getTrigliceridos() {
        return trigliceridos;
    }

    public void setTrigliceridos(double trigliceridos) {
        this.trigliceridos = trigliceridos;
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
