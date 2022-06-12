package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.example.nutririonbackend.Model.Merienda;

public interface MeriendaInterfaz {
    public List<Merienda> getAllMerienda();
    public Merienda saveMerienda(Merienda merienda);
    public Optional<Merienda> findById(int id);
    public void deletedByid(int id);
}
