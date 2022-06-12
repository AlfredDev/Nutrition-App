package com.example.nutririonbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String Nombre;
    private String usuario;
    private String password;
    private String Genero;
    private String Pais;
    private String Prueba;
    private Data FecNac;
    private String Telefono;
    private String profesion;


    public Usuario() {
    }


    public Usuario(String nombre, String usuario, String password, String genero, String pais, String prueba,
            Data fecNac, String telefono, String profesion) {
        Nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        Genero = genero;
        Pais = pais;
        Prueba = prueba;
        FecNac = fecNac;
        Telefono = telefono;
        this.profesion = profesion;
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


    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getGenero() {
        return Genero;
    }


    public void setGenero(String genero) {
        Genero = genero;
    }


    public String getPais() {
        return Pais;
    }


    public void setPais(String pais) {
        Pais = pais;
    }


    public String getPrueba() {
        return Prueba;
    }


    public void setPrueba(String prueba) {
        Prueba = prueba;
    }


    public Data getFecNac() {
        return FecNac;
    }


    public void setFecNac(Data fecNac) {
        FecNac = fecNac;
    }


    public String getTelefono() {
        return Telefono;
    }


    public void setTelefono(String telefono) {
        Telefono = telefono;
    }


    public String getProfesion() {
        return profesion;
    }


    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    

    
}
