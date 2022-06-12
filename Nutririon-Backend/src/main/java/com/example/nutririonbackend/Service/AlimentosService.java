package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.AlimentosInterfaz;
import com.example.nutririonbackend.Model.Alimentos;
import com.example.nutririonbackend.Repository.AlimentosRepository;

@Service
public class AlimentosService implements AlimentosInterfaz{

    @Autowired
    private AlimentosRepository alimentos;

    @Override
    public List<Alimentos> getAllAlimentos() {
        return alimentos.findAll();
    }

    @Override
    public Alimentos saveAlimentos(Alimentos aliment) {
        return alimentos.save(aliment);
    }

    @Override
    public Optional<Alimentos> findById(int id) {
        return alimentos.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        alimentos.deleteById(id);
        
    }
    
}
