package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.Recetas;

public interface RecetasInterfaz {
    public List<Recetas> getAllRecetas();
    public Recetas saveRecetas(Recetas recetas);
    public Optional<Recetas> findById(int id);
    public void deletedByid(int id);
}
