package com.example.nutririonbackend.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private String Genero;
    private Date FechaNacimiento;
    private String Ocupacion;

    @JoinColumn(name="direccion_id",unique=true)
    @OneToOne(cascade = CascadeType.ALL)
    private DireccionPaciente direccionPaciente;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public DireccionPaciente getDireccionPaciente() {
        return direccionPaciente;
    }

    public void setDireccionPaciente(DireccionPaciente direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }
}
