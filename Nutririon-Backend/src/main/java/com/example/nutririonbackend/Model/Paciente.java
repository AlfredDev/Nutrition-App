package com.example.nutririonbackend.Model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

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
    private DireccionPaciente IDdireccionPaciente;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Usuario IDUsuario;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String genero, Date fechaNacimiento, String ocupacion,
            DireccionPaciente iDdireccionPaciente, Usuario iDUsuario) {
        this.id = id;
        Nombre = nombre;
        Genero = genero;
        FechaNacimiento = fechaNacimiento;
        Ocupacion = ocupacion;
        IDdireccionPaciente = iDdireccionPaciente;
        IDUsuario = iDUsuario;
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

    public DireccionPaciente getIDdireccionPaciente() {
        return IDdireccionPaciente;
    }

    public void setIDdireccionPaciente(DireccionPaciente direccionPaciente) {
        IDdireccionPaciente = direccionPaciente;
    }

    public Usuario getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(Usuario iDUsuario) {
        IDUsuario = iDUsuario;
    }

    
}
