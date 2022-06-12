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

import com.example.nutririonbackend.InterfaceService.HistorialAlimenticioInterfaz;
import com.example.nutririonbackend.Model.HistorialAlimenticio;


@RestController
@RequestMapping("/HistorialAlimenticio")
@CrossOrigin
public class HistorialAlimenticioController {
    @Autowired
    private HistorialAlimenticioInterfaz histo_service;

    @PostMapping("/add")
    public String add(@RequestBody  HistorialAlimenticio historialAlimenticio){
        histo_service.saveHistorialAlimenticio(historialAlimenticio);
        return "Composicion Coporal insertada";
    }

    @GetMapping("/getAll")
    public List<HistorialAlimenticio> getAllHistorialAlimenticio(){
        return  histo_service.getAllHistorialAlimenticio();
    }

    @GetMapping("/findById/{id}")
    public Optional<HistorialAlimenticio> findById(@PathVariable int id){
        return histo_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        histo_service.deletedByid(id);
    }
    
}
