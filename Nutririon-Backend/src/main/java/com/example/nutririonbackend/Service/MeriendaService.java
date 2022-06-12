package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.MeriendaInterfaz;
import com.example.nutririonbackend.Model.Merienda;
import com.example.nutririonbackend.Repository.MeriendaRepository;

@Service
public class MeriendaService implements MeriendaInterfaz{

    @Autowired
    private MeriendaRepository merienda;

    @Override
    public List<Merienda> getAllMerienda() {
        return merienda.findAll();
    }

    @Override
    public Merienda saveMerienda(Merienda meriend) {
        return merienda.save(meriend);
    }

    @Override
    public Optional<Merienda> findById(int id) {
        return merienda.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        merienda.deleteById(id);
        
    }
    
}