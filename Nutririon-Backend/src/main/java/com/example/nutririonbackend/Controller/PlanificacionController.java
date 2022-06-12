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

import com.example.nutririonbackend.InterfaceService.PlanificacionInterfaz;
import com.example.nutririonbackend.Model.Planificacion;


@RestController
@RequestMapping("/Planificacion")
@CrossOrigin
public class PlanificacionController {
    @Autowired
    private PlanificacionInterfaz plani_service;

    @PostMapping("/addPlanificacion")
    public String addPlanificacion(@RequestBody  Planificacion planificacion){
        plani_service.savePlanificacion(planificacion);
        return "Planificacion insertados";
    }

    @GetMapping("/getAll")
    public List<Planificacion> getAllPlanificacion(){
        return  plani_service.getAllPlanificacion();
    }

    @GetMapping("/findById/{id}")
    public Optional<Planificacion> findById(@PathVariable int id){
        return plani_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        plani_service.deletedByid(id);
    }
}
