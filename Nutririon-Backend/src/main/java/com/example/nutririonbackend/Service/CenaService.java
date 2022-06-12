package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.CenaInterfaz;
import com.example.nutririonbackend.Model.Cena;
import com.example.nutririonbackend.Repository.CenaRepository;

@Service
public class CenaService implements CenaInterfaz{

    @Autowired
    private CenaRepository cena;

    @Override
    public List<Cena> getAllCena() {
        return cena.findAll();
    }

    @Override
    public Cena saveCena(Cena dinner) {
        return cena.save(dinner);
    }

    @Override
    public Optional<Cena> findById(int id) {
        return cena.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        cena.deleteById(id);
        
    }
    
}