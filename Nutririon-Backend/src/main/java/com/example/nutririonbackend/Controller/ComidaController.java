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

import com.example.nutririonbackend.InterfaceService.Comida;
import com.example.nutririonbackend.Model.Comida;

@RestController
@RequestMapping("/Comida")
@CrossOrigin

public class ComidaController {
    @Autowired
    private ComidaInterfaz comida_service;

    @PostMapping("/addComida")
    public String add(@RequestBody  Comida comida){
        comida_service.saveComida(comida);
        return "Comida registrado";
    }

    @GetMapping("/getAll")
    public List<Comida> getAllComida(){
        return  comida_service.getAllComida();
    }

    @GetMapping("/findById/{id}")
    public Optional<Comida> findById(@PathVariable int id){
        return comida_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        comida_service.deletedByid(id);
    }
}