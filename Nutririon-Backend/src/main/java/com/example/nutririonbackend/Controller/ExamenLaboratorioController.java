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

import com.example.nutririonbackend.InterfaceService.ExamenLaboratorioInterfaz;
import com.example.nutririonbackend.InterfaceService.ExpedienteInterfaz;
import com.example.nutririonbackend.Model.ExamenLaboratorio;
import com.example.nutririonbackend.Model.Expediente;

@RestController
@RequestMapping("/ExamenLAboratorio")
@CrossOrigin
public class ExamenLAboratorioController {


    @Autowired
    private ExamenLaboratorioInterfaz exLab_interfaz;
    @Autowired
    private ExpedienteInterfaz Expe_interfaz;

    
    @PostMapping("/addExamenLAboratorio")
    public String addExamenLaboratorio(@RequestBody ExamenLaboratorio examenLAboratorio) {

        Expediente exaf = Expe_interfaz.getId(examenLAboratorio.getId());

        ExamenLaboratorio exau = new ExamenLaboratorio();
        exau.setIDExpediente(exaf);
        exau.setDescripcion(examenLAboratorio.getDescripcion());
        exau.setFecha(examenLAboratorio.getFecha());
        exau.setNombreExamenes(examenLAboratorio.getNombreExamenes());
        exau.setOtrosExamenes(examenLAboratorio.getOtrosExamenes());

        exLab_interfaz.saveExamenLaboratorio(exau);


        return "Examen agregado";
    }

    @GetMapping("/getAllExamenLaboratorio")
    public List<ExamenLaboratorio> getAllExamenLaboratorio(){
        return exLab_interfaz.getAllExamenLaboratorio();
    }

    @GetMapping("/findById/{id}")
    public Optional<ExamenLaboratorio> findById(@PathVariable int id){
        return exLab_interfaz.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        exLab_interfaz.deletedByid(id);
    }
    
}
