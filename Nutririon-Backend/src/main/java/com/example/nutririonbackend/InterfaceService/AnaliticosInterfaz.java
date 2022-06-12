package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.Analiticos;

public interface AnaliticosInterfaz {
    public List<Analiticos> getAllAnaliticos();
    public Analiticos saveAnaliticos(Analiticos analiticos);
    public Optional<Analiticos> findById(int id);
    public void deletedByid(int id);
}
