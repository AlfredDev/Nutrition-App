package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.HistorialAlimenticioInterfaz;
import com.example.nutririonbackend.Model.HistorialAlimenticio;
import com.example.nutririonbackend.Repository.HistorialAlimenticioRepository;

@Service
public class HistorialAlimenticioService implements HistorialAlimenticioInterfaz{
    @Autowired
    private HistorialAlimenticioRepository historialAlimenticio;

    @Override
    public List<HistorialAlimenticio> getAllHistorialAlimenticio() {
        return historialAlimenticio.findAll();
    }

    @Override
    public HistorialAlimenticio saveHistorialAlimenticio(HistorialAlimenticio historialAlimentic) {
        return historialAlimenticio.save(historialAlimentic);
    }

    @Override
    public Optional<HistorialAlimenticio> findById(int id) {
        return historialAlimenticio.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        historialAlimenticio.deleteById(id);
        
    }

}
