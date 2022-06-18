package com.example.nutririonbackend.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@ToString
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date inicio_consulta;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date fin_consulta;
    private  String estatus;
    private String lugarConsulta;
    private String liga_video;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Paciente paciente;


    public Consulta() {

    }

    public Consulta(int id, Date inicio_consulta, Date fin_consulta, String estatus, String lugarConsulta, String liga_video, Paciente paciente) {
        this.id = id;
        this.inicio_consulta = inicio_consulta;
        this.fin_consulta = fin_consulta;
        this.estatus = estatus;
        this.lugarConsulta = lugarConsulta;
        this.liga_video = liga_video;
        this.paciente = paciente;
    }
}
