package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.MacroNutrientes;

public interface MacroNutrientesInterfaz {
    public List<MacroNutrientes> getAllMacroNutrientes();
    public MacroNutrientes saveMacroNutrientes(MacroNutrientes macroNutrientes);
    public Optional<MacroNutrientes> findById(int id);
    public void deletedByid(int id);
}
