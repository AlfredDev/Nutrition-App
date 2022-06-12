package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.Historial;

public interface HistorialInterfaz {
    public List<Historial> getAllHistorial();
    public Historial saveHistorial(Historial historial);
    public Optional<Historial> findById(int id);
    public void deletedByid(int id);
}
