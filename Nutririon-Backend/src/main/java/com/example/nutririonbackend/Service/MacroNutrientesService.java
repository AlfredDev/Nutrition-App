package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.MacroNutrientesInterfaz;
import com.example.nutririonbackend.Model.MacroNutrientes;
import com.example.nutririonbackend.Repository.MacroNutrientesRepository;

@Service
public class MacroNutrientesService implements MacroNutrientesInterfaz{
    
    @Autowired
    private MacroNutrientesRepository macroNutrientes;

    @Override
    public List<MacroNutrientes> getAllMacroNutrientes() {
        return macroNutrientes.findAll();
    }

    @Override
    public MacroNutrientes saveMacroNutrientes(MacroNutrientes macroNutrient) {
        return macroNutrientes.save(macroNutrient);
    }

    @Override
    public Optional<MacroNutrientes> findById(int id) {
        return macroNutrientes.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        macroNutrientes.deleteById(id);
        
    }

}
