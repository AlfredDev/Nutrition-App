package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.RecetasInterfaz;
import com.example.nutririonbackend.Model.Recetas;
import com.example.nutririonbackend.Repository.RecetasRepository;

@Service
public class RecetasService implements RecetasInterfaz{
    
    @Autowired
    private RecetasRepository recetas;

    @Override
    public List<Recetas> getAllRecetas() {
        return recetas.findAll();
    }

    @Override
    public Recetas saveRecetas(Recetas receta) {
        return recetas.save(receta);
    }

    @Override
    public Optional<Recetas> findById(int id) {
        return recetas.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        recetas.deleteById(id);
    }

}
