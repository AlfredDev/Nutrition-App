package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.HistorialClinico;

public interface HistorialClinicoInterfaz {
    public List<HistorialClinico> getAllHistorialClinico();
    public HistorialClinico saveHistorialClinico(HistorialClinico HistorialClinico);
    public Optional<HistorialClinico> findById(int id);
    public void deletedByid(int id);
}
