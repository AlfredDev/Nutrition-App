package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.HistorialAlimenticio;

public interface HistorialAlimenticioInterfaz {
    public List<HistorialAlimenticio> getAllHistorialAlimenticio();
    public HistorialAlimenticio saveHistorialAlimenticio(HistorialAlimenticio historialAlimenticio);
    public Optional<HistorialAlimenticio> findById(int id);
    public void deletedByid(int id);
}
