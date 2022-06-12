package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.ComidaInterfaz;
import com.example.nutririonbackend.Model.Comida;
import com.example.nutririonbackend.Repository.ComidaRepository;

@Service
public class ComidaService implements ComidaInterfaz{

    @Autowired
    private ComidaRepository comida;

    @Override
    public List<Comida> getAllComida() {
        return comida.findAll();
    }

    @Override
    public Comida saveComida(Comida comid) {
        return comida.save(comid);
    }

    @Override
    public Optional<Comida> findById(int id) {
        return comida.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        comida.deleteById(id);
        
    }
    
}