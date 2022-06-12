package com.example.nutririonbackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Recetas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private DireccionPaciente IdUsua;
    private String Nombre;
    private String Descripcion;
    private float TiempoPreparacion;
    private float PesoFinal;
    private String Ingredientes;
    private String MetodoPreparacion;
    private String Porcion;


    public Recetas() {
    }


    public Recetas(DireccionPaciente idUsua, String nombre, String descripcion, float tiempoPreparacion,
            float pesoFinal, String ingredientes, String metodoPreparacion, String porcion) {
        IdUsua = idUsua;
        Nombre = nombre;
        Descripcion = descripcion;
        TiempoPreparacion = tiempoPreparacion;
        PesoFinal = pesoFinal;
        Ingredientes = ingredientes;
        MetodoPreparacion = metodoPreparacion;
        Porcion = porcion;
    }


    public DireccionPaciente getIdUsua() {
        return IdUsua;
    }


    public void setIdUsua(DireccionPaciente idUsua) {
        IdUsua = idUsua;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getDescripcion() {
        return Descripcion;
    }


    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


    public float getTiempoPreparacion() {
        return TiempoPreparacion;
    }


    public void setTiempoPreparacion(float tiempoPreparacion) {
        TiempoPreparacion = tiempoPreparacion;
    }


    public float getPesoFinal() {
        return PesoFinal;
    }


    public void setPesoFinal(float pesoFinal) {
        PesoFinal = pesoFinal;
    }


    public String getIngredientes() {
        return Ingredientes;
    }


    public void setIngredientes(String ingredientes) {
        Ingredientes = ingredientes;
    }


    public String getMetodoPreparacion() {
        return MetodoPreparacion;
    }


    public void setMetodoPreparacion(String metodoPreparacion) {
        MetodoPreparacion = metodoPreparacion;
    }


    public String getPorcion() {
        return Porcion;
    }


    public void setPorcion(String porcion) {
        Porcion = porcion;
    }


    
    
}
