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

import com.example.nutririonbackend.InterfaceService.ActividadFisicaInterfaz;
import com.example.nutririonbackend.Model.ActividadFisica;

@RestController
@RequestMapping("/actFisica")
@CrossOrigin
public class ActividadFisicaContrroller {
    @Autowired
    private ActividadFisicaInterfaz act_service;

    @PostMapping("/addActividadFisica")
    public String add(@RequestBody  ActividadFisica actividadFisica){
        act_service.saveActividad(actividadFisica);
        return "Actividad fisica insertada";
    }

    @GetMapping("/getAll")
    public List<ActividadFisica> getAllActividades(){
        return  act_service.getAllActividades();
    }

    @GetMapping("/findById/{id}")
    public Optional<ActividadFisica> findById(@PathVariable int id){
        return act_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        act_service.deletedByid(id);
    }
}
