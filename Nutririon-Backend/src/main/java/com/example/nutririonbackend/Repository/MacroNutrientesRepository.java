package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.MacroNutrientes;

@Repository
public interface MacroNutrientesRepository extends JpaRepository<MacroNutrientes,Integer>{
    
}
