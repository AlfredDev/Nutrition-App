package com.example.nutririonbackend.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@ToString
public class DatosAntropometricos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double peso;
    private double altura;
    private float perimetroCadera;
    private float perimetroCintura;
    private float perimetroCutaneoAbdominal;
    private float perimetroCutaneoPectoral;
    private float pliegeCutaneoMuslo;
    private float pliegeCutaneoSubecapular;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date fecha_registro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "expediente_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Expediente expediente;


    public DatosAntropometricos(int id, double peso, double altura, float perimetroCadera, float perimetroCintura, float perimetroCutaneoAbdominal, float perimetroCutaneoPectoral, float pliegeCutaneoMuslo, float pliegeCutaneoSubecapular, Date fecha_registro) {
        this.id = id;
        this.peso = peso;
        this.altura = altura;
        this.perimetroCadera = perimetroCadera;
        this.perimetroCintura = perimetroCintura;
        this.perimetroCutaneoAbdominal = perimetroCutaneoAbdominal;
        this.perimetroCutaneoPectoral = perimetroCutaneoPectoral;
        this.pliegeCutaneoMuslo = pliegeCutaneoMuslo;
        this.pliegeCutaneoSubecapular = pliegeCutaneoSubecapular;
        this.fecha_registro = fecha_registro;
    }

    public DatosAntropometricos() {
    }
}
