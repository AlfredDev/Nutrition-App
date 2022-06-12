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

import com.example.nutririonbackend.InterfaceService.MacroNutrientesInterfaz;
import com.example.nutririonbackend.Model.MacroNutrientes;

@RestController
@RequestMapping("/MacroNutrientes")
@CrossOrigin
public class MacroNutrientesController {
    @Autowired
    private MacroNutrientesInterfaz macroNutrientes_service;

    @PostMapping("/addMacroNutrientes")
    public String addMacroNutrientes(@RequestBody  MacroNutrientes macroNutrientes){
        macroNutrientes_service.saveMacroNutrientes(macroNutrientes);
        return "MacroNutrientes insertados";
    }

    @GetMapping("/getAll")
    public List<MacroNutrientes> getAllMacroNutrientes(){
        return  macroNutrientes_service.getAllMacroNutrientes();
    }

    @GetMapping("/findById/{id}")
    public Optional<MacroNutrientes> findById(@PathVariable int id){
        return macroNutrientes_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        macroNutrientes_service.deletedByid(id);
    }
}
