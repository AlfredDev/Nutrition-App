package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.HistorialClinicoInterfaz;
import com.example.nutririonbackend.Model.HistorialClinico;
import com.example.nutririonbackend.Repository.HistorialClinicoRepository;

@Service
public class HistorialClinicoService implements HistorialClinicoInterfaz{

    @Autowired
    private HistorialClinicoRepository historialClinico;

    @Override
    public List<HistorialClinico> getAllHistorialClinico() {
        return historialClinico.findAll();
    }

    @Override
    public HistorialClinico saveHistorialClinico(HistorialClinico historialClini) {
        return historialClinico.save(historialClini);
    }

    @Override
    public Optional<HistorialClinico> findById(int id) {
        return historialClinico.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        historialClinico.deleteById(id);
        
    }
    
    
}
