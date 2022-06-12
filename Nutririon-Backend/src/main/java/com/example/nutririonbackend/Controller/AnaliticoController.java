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

import com.example.nutririonbackend.InterfaceService.AnaliticosInterfaz;
import com.example.nutririonbackend.Model.Analiticos;

@RestController
@RequestMapping("/Analiticos")
@CrossOrigin
public class AnaliticoController {
    @Autowired
    private AnaliticosInterfaz ana_service;

    @PostMapping("/addAnalitica")
    public String add(@RequestBody  Analiticos analitico){
        ana_service.saveAnaliticos(analitico);
        return "Analiticos insertados";
    }

    @GetMapping("/getAll")
    public List<Analiticos> getAllAnaliticos(){
        return  ana_service.getAllAnaliticos();
    }

    @GetMapping("/findById/{id}")
    public Optional<Analiticos> findById(@PathVariable int id){
        return ana_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        ana_service.deletedByid(id);
    }
}
