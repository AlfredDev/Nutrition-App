package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.AnaliticosInterfaz;
import com.example.nutririonbackend.Model.Analiticos;
import com.example.nutririonbackend.Repository.AnaliticosRepository;

@Service
public class AnaliticosService implements AnaliticosInterfaz{
    @Autowired
    private AnaliticosRepository analiticos;

    @Override
    public List<Analiticos> getAllAlimentos() {
        return analiticos.findAll();
    }

    @Override
    public Analiticos saveAnaliticos(Analiticos analitico) {
        return analiticos.save(analitico);
    }

    @Override
    public Optional<Analiticos> findById(int id) {
        return analiticos.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        analiticos.deleteById(id);
        
    }
    
}
