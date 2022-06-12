package com.example.nutririonbackend.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nutririonbackend.DTO.ExpedienteDto;
import com.example.nutririonbackend.InterfaceService.ActividadFisicaInterfaz;
import com.example.nutririonbackend.InterfaceService.AnaliticosInterfaz;
import com.example.nutririonbackend.InterfaceService.ComposicioncoporalInterfaz;
import com.example.nutririonbackend.InterfaceService.ExpedienteInterfaz;
import com.example.nutririonbackend.InterfaceService.HistorialInterfaz;
import com.example.nutririonbackend.InterfaceService.MacroNutrientesInterfaz;
import com.example.nutririonbackend.InterfaceService.PacienteInterfaz;
import com.example.nutririonbackend.InterfaceService.PlanAlimenticioInterfaz;
import com.example.nutririonbackend.InterfaceService.PlanificacionInterfaz;
import com.example.nutririonbackend.Model.ActividadFisica;
import com.example.nutririonbackend.Model.Analiticos;
import com.example.nutririonbackend.Model.ComposicionCorporal;
import com.example.nutririonbackend.Model.Expediente;
import com.example.nutririonbackend.Model.Historial;
import com.example.nutririonbackend.Model.MacroNutrientes;
import com.example.nutririonbackend.Model.Paciente;
import com.example.nutririonbackend.Model.PlanAlimenticio;
import com.example.nutririonbackend.Model.Planificacion;

@RestController
@RequestMapping("/expediente")
@CrossOrigin
public class ExpedienteControlller {

    @Autowired
    private PacienteInterfaz paciente_interfaz;

    @Autowired
    private PlanAlimenticioInterfaz plana_interfaz;

    @Autowired
    private ComposicioncoporalInterfaz compo_interfaz;

    @Autowired
    private ActividadFisicaInterfaz act_interfaz;

    @Autowired
    private AnaliticosInterfaz ana_interfaz;
    
    @Autowired
    private HistorialInterfaz histo_interfaz;

    @Autowired
    private MacroNutrientesInterfaz macro_interfaz;

    @Autowired
    private PlanificacionInterfaz plani_interfaz;

    @Autowired
    private ExpedienteInterfaz Expediente_interfaz;

    @PostMapping("/addExpediente")
    public String addExpediente(@RequestBody ExpedienteDto expediente){

        Paciente paciente = paciente_interfaz.getId(expediente.getiDPaciente());
        PlanAlimenticio plana = plana_interfaz.getId(expediente.getiDPlanAlimenticio());
        ComposicionCorporal compocor = compo_interfaz.getId(expediente.getiDComposicionCorporal());
        ActividadFisica actfis = act_interfaz.getId(expediente.getiDActividadFisica());
        Analiticos analit = ana_interfaz.getId(expediente.getiDAnaliticos());
        Historial histo = histo_interfaz.getId(expediente.getiDHistorial());
        MacroNutrientes macro = macro_interfaz.getId(expediente.getiDMacroNutrientes());
        Planificacion plani = plani_interfaz.getId(expediente.getiDPlanificacion());
        


        Expediente ex=new Expediente();
        ex.setMotivo(expediente.getMotivo());
        ex.setExpectativa(expediente.getExpectativa());
        ex.setObjetivoClinico(expediente.getObjetivoClinico());
        ex.setObservaciones(expediente.getObservaciones());
        ex.setOtraInfo(expediente.getOtraInfo());
        ex.setComporAlimenticio(expediente.getComporAlimenticio());
        ex.setiDPaciente(paciente);
        ex.setiDPlanAlimenticio(plana);
        ex.setiDComposicionCorporal(compocor);
        ex.setiDActividadFisica(actfis);
        ex.setiDAnaliticos(analit);
        ex.setiDHistorial(histo);
        ex.setiDMacroNutrientes(macro);
        ex.setiDPlanificacion(plani);

        Expediente_interfaz.saveExpediente(ex);

        return "Expediente registrado";
    }

    @GetMapping("/getAllExpediente")
    public List<Expediente> getAllExpediente(){
        return Expediente_interfaz.getAllExpediente();
    }

    @GetMapping("/findById/{id}")
    public Optional<Expediente> findById(@PathVariable int id){
        return Expediente_interfaz.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        Expediente_interfaz.deletedByid(id);
    }
      
}
