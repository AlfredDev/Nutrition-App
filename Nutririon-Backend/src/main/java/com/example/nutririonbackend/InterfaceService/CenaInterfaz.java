package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.example.nutririonbackend.Model.Cena;

public interface CenaInterfaz {
    public List<Cena> getAllCena();
    public Cena saveCena(Cena cena);
    public Optional<Cena> findById(int id);
    public void deletedByid(int id);
}