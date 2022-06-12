package com.example.nutririonbackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Expediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Motivo;
    private String Expectativa;
    private String ObjetivoClinico;
    private String OtraInfo;
    private String Observaciones;
    private String ComporAlimenticio;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Paciente iDPaciente;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private PlanAlimenticio iDPlanAlimenticio;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private ComposicionCorporal iDComposicionCorporal;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private ActividadFisica iDActividadFisica;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Analiticos iDAnaliticos;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Historial iDHistorial;
    
    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private MacroNutrientes iDMacroNutrientes;

    @JoinColumn(name = "id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Planificacion iDPlanificacion;


    

    public Expediente() {
    }

    public Expediente(String motivo, String expectativa, String objetivoClinico, String otraInfo, String observaciones,
            String comporAlimenticio, Paciente iDPaciente,
            PlanAlimenticio iDPlanAlimenticio, ComposicionCorporal iDComposicionCorporal,
            ActividadFisica iDActividadFisica, Analiticos iDAnaliticos, Historial iDHistorial,
            MacroNutrientes iDMacroNutrientes, Planificacion iDPlanificacion) {
        Motivo = motivo;
        Expectativa = expectativa;
        ObjetivoClinico = objetivoClinico;
        OtraInfo = otraInfo;
        Observaciones = observaciones;
        ComporAlimenticio = comporAlimenticio;
        this.iDPaciente = iDPaciente;
        this.iDPlanAlimenticio = iDPlanAlimenticio;
        this.iDComposicionCorporal = iDComposicionCorporal;
        this.iDActividadFisica = iDActividadFisica;
        this.iDAnaliticos = iDAnaliticos;
        this.iDHistorial = iDHistorial;
        this.iDMacroNutrientes = iDMacroNutrientes;
        this.iDPlanificacion = iDPlanificacion;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public String getExpectativa() {
        return Expectativa;
    }

    public void setExpectativa(String expectativa) {
        Expectativa = expectativa;
    }

    public String getObjetivoClinico() {
        return ObjetivoClinico;
    }

    public void setObjetivoClinico(String objetivoClinico) {
        ObjetivoClinico = objetivoClinico;
    }

    public String getOtraInfo() {
        return OtraInfo;
    }

    public void setOtraInfo(String otraInfo) {
        OtraInfo = otraInfo;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public String getComporAlimenticio() {
        return ComporAlimenticio;
    }

    public void setComporAlimenticio(String comporAlimenticio) {
        ComporAlimenticio = comporAlimenticio;
    }

    public Paciente getiDPaciente() {
        return iDPaciente;
    }

    public void setiDPaciente(Paciente iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public PlanAlimenticio getiDPlanAlimenticio() {
        return iDPlanAlimenticio;
    }

    public void setiDPlanAlimenticio(PlanAlimenticio iDPlanAlimenticio) {
        this.iDPlanAlimenticio = iDPlanAlimenticio;
    }

    public ComposicionCorporal getiDComposicionCorporal() {
        return iDComposicionCorporal;
    }

    public void setiDComposicionCorporal(ComposicionCorporal iDComposicionCorporal) {
        this.iDComposicionCorporal = iDComposicionCorporal;
    }

    public ActividadFisica getiDActividadFisica() {
        return iDActividadFisica;
    }

    public void setiDActividadFisica(ActividadFisica iDActividadFisica) {
        this.iDActividadFisica = iDActividadFisica;
    }

    public Analiticos getiDAnaliticos() {
        return iDAnaliticos;
    }

    public void setiDAnaliticos(Analiticos iDAnaliticos) {
        this.iDAnaliticos = iDAnaliticos;
    }

    public Historial getiDHistorial() {
        return iDHistorial;
    }

    public void setiDHistorial(Historial iDHistorial) {
        this.iDHistorial = iDHistorial;
    }

    public MacroNutrientes getiDMacroNutrientes() {
        return iDMacroNutrientes;
    }

    public void setiDMacroNutrientes(MacroNutrientes iDMacroNutrientes) {
        this.iDMacroNutrientes = iDMacroNutrientes;
    }

    public Planificacion getiDPlanificacion() {
        return iDPlanificacion;
    }

    public void setiDPlanificacion(Planificacion iDPlanificacion) {
        this.iDPlanificacion = iDPlanificacion;
    }

    



    

    


}
