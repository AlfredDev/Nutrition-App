package com.example.nutririonbackend.DTO;

import lombok.Data;

@Data
public class HistorialDto {
    private int id;
    private String CalidadSueño;
    private boolean Fumador;
    private boolean BebeAlcohol;
    private String EstadoCivil;
    private int IDHistorialAlim;
    private int IDHistorialClinic;
}
