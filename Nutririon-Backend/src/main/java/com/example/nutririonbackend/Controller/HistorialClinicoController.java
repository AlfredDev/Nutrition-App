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

import com.example.nutririonbackend.InterfaceService.HistorialClinicoInterfaz;
import com.example.nutririonbackend.Model.HistorialClinico;

@RestController
@RequestMapping("/HistorialClinico")
@CrossOrigin
public class HistorialClinicoController {
    @Autowired
    private HistorialClinicoInterfaz histo_service;

    @PostMapping("/add")
    public String add(@RequestBody  HistorialClinico historialClinico){
        histo_service.saveHistorialClinico(historialClinico);
        return "Composicion Coporal insertada";
    }

    @GetMapping("/getAll")
    public List<HistorialClinico> getAllHistorialClinico(){
        return  histo_service.getAllHistorialClinico();
    }

    @GetMapping("/findById/{id}")
    public Optional<HistorialClinico> findById(@PathVariable int id){
        return histo_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        histo_service.deletedByid(id);
    }
}
