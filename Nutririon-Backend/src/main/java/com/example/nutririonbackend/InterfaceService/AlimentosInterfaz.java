package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.example.nutririonbackend.Model.Alimentos;

public interface AlimentosInterfaz {
    public List<Alimentos> getAllAlimentos();
    public Alimentos saveAlimentos(Alimentos alimentos);
    public Optional<Alimentos> findById(int id);
    public void deletedByid(int id);
}
