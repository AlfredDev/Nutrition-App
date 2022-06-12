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

import com.example.nutririonbackend.InterfaceService.Cena;
import com.example.nutririonbackend.Model.Cena;

@RestController
@RequestMapping("/Cena")
@CrossOrigin

public class CenaController {
    @Autowired
    private CenaInterfaz cena_service;

    @PostMapping("/addCena")
    public String add(@RequestBody  Cena cena){
        cena_service.saveCena(cena);
        return "Cena registrado";
    }

    @GetMapping("/getAll")
    public List<Cena> getAllCena(){
        return  cena_service.getAllCena();
    }

    @GetMapping("/findById/{id}")
    public Optional<Cena> findById(@PathVariable int id){
        return cena_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        cena_service.deletedByid(id);
    }
}