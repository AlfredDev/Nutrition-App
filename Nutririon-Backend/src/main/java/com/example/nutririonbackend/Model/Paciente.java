package com.example.nutririonbackend.Model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@ToString
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private String Genero;
    private Date FechaNacimiento;
    private String Ocupacion;

    @JoinColumn(name = "direccion_id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private DireccionPaciente direccionPaciente;
    @OneToOne(cascade = CascadeType.ALL)
    private Expediente expediente;


    public Paciente() {
    }

    public Paciente(int id, String nombre, String genero, Date fechaNacimiento, String ocupacion, DireccionPaciente direccionPaciente) {
        this.id = id;
        Nombre = nombre;
        Genero = genero;
        FechaNacimiento = fechaNacimiento;
        Ocupacion = ocupacion;
        this.direccionPaciente = direccionPaciente;
    }
}