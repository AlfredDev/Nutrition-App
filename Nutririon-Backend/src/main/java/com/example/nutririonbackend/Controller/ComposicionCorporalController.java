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

import com.example.nutririonbackend.InterfaceService.ComposicioncoporalInterfaz;
import com.example.nutririonbackend.Model.ComposicionCorporal;

@RestController
@RequestMapping("/composicioncorporal")
@CrossOrigin
public class ComposicionCorporalController {

    @Autowired
    private ComposicioncoporalInterfaz Compo_service;

    @PostMapping("/add")
    public String add(@RequestBody  ComposicionCorporal composicionCorporal){
        Compo_service.saveComposicionCorporal(composicionCorporal);
        return "Composicion Coporal insertada";
    }

    @GetMapping("/getAll")
    public List<ComposicionCorporal> getAllComposicionCorporal(){
        return  Compo_service.getAllComposicionCorporal();
    }

    @GetMapping("/findById/{id}")
    public Optional<ComposicionCorporal> findById(@PathVariable int id){
        return Compo_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        Compo_service.deletedByid(id);
    }
}
