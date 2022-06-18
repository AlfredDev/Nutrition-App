package com.example.nutririonbackend.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class InformacionGeneral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String motivoConsulta;
    private String Expectativas;
    private  String objetivosClinicos;
    private String otraInformacion;

    public InformacionGeneral(){}

    public InformacionGeneral(int id, String motivoConsulta, String expectativas, String objetivosClinicos, String otraInformacion) {
        this.id = id;
        this.motivoConsulta = motivoConsulta;
        Expectativas = expectativas;
        this.objetivosClinicos = objetivosClinicos;
        this.otraInformacion = otraInformacion;
    }
}

