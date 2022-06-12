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

import com.example.nutririonbackend.InterfaceService.Merienda;
import com.example.nutririonbackend.Model.Merienda;

@RestController
@RequestMapping("/Merienda")
@CrossOrigin

public class MeriendaController {
    @Autowired
    private MeriendaInterfaz merienda_service;

    @PostMapping("/addMerienda")
    public String add(@RequestBody  Merienda merienda){
        merienda_service.saveMerienda(merienda);
        return "Merienda registrado";
    }

    @GetMapping("/getAll")
    public List<Merienda> getAllMerienda(){
        return  merienda_service.getAllMerienda();
    }

    @GetMapping("/findById/{id}")
    public Optional<Merienda> findById(@PathVariable int id){
        return merienda_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        merienda_service.deletedByid(id);
    }
}