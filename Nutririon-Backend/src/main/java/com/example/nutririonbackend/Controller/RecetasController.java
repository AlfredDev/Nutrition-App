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

import com.example.nutririonbackend.InterfaceService.RecetasInterfaz;
import com.example.nutririonbackend.Model.Recetas;



@RestController
@RequestMapping("/Recetas")
@CrossOrigin
public class RecetasController {
    @Autowired
    private RecetasInterfaz re_service;

    @PostMapping("/addPlanificacion")
    public String addPlanificacion(@RequestBody  Recetas recetas){
        re_service.saveRecetas(recetas);
        return "Planificacion insertados";
    }

    @GetMapping("/getAll")
    public List<Recetas> getAllRecetas(){
        return  re_service.getAllRecetas();
    }

    @GetMapping("/findById/{id}")
    public Optional<Recetas> findById(@PathVariable int id){
        return re_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        re_service.deletedByid(id);
    }
}
