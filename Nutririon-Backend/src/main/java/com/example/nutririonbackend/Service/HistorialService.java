package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.HistorialInterfaz;
import com.example.nutririonbackend.Model.Historial;
import com.example.nutririonbackend.Repository.HistorialRepository;
@Service
public class HistorialService implements HistorialInterfaz{

    @Autowired
    private HistorialRepository historial;

    @Override
    public List<Historial> getAllHistorial() {
        return historial.findAll();
    }

    @Override
    public Historial saveHistorial(Historial historia) {
        return historial.save(historia);
    }

    @Override
    public Optional<Historial> findById(int id) {
        return historial.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        historial.deleteById(id);
        
    }

}
