package com.example.nutririonbackend.DTO;

import lombok.Data;

@Data
public class ExpedienteDto {
    private String Motivo;
    private String Expectativa;
    private String ObjetivoClinico;
    private String OtraInfo;
    private String Observaciones;
    private String ComporAlimenticio;
    private int iDPaciente;
    private int iDPlanAlimenticio;
    private int iDComposicionCorporal;
    private int iDActividadFisica;
    private int iDAnaliticos;
    private int iDHistorial;
    private int iDMacroNutrientes;
    private int iDPlanificacion;
}
