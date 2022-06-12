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

import com.example.nutririonbackend.InterfaceService.Desayuno;
import com.example.nutririonbackend.Model.Desayuno;

@RestController
@RequestMapping("/Desayuno")
@CrossOrigin

public class DesayunoController {
    @Autowired
    private DesayunoInterfaz desayuno_service;

    @PostMapping("/addDesayuno")
    public String add(@RequestBody  Desayuno desayuno){
        desayuno_service.saveDesayuno(desayuno);
        return "Desayuno registrado";
    }

    @GetMapping("/getAll")
    public List<Desayuno> getAllDesayuno(){
        return  desayuno_service.getAllDesayuno();
    }

    @GetMapping("/findById/{id}")
    public Optional<Desayuno> findById(@PathVariable int id){
        return desayuno_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        desayuno_service.deletedByid(id);
    }
}
