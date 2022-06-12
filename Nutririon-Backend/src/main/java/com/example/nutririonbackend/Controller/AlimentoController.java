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

import com.example.nutririonbackend.InterfaceService.AlimentosInterfaz;
import com.example.nutririonbackend.Model.Alimentos;

@RestController
@RequestMapping("/Alimentos")
@CrossOrigin

public class AlimentoController {
    @Autowired
    private AlimentosInterfaz alimentos_service;

    @PostMapping("/addAlimentos")
    public String addAlimentos(@RequestBody  Alimentos alimentos){
        alimentos_service.saveAlimentos(alimentos);
        return "Alimentos insertados";
    }

    @GetMapping("/getAll")
    public List<Alimentos> getAllAlimentos(){
        return  alimentos_service.getAllAlimentos();
    }

    @GetMapping("/findById/{id}")
    public Optional<Alimentos> findById(@PathVariable int id){
        return alimentos_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        alimentos_service.deletedByid(id);
    }
}
