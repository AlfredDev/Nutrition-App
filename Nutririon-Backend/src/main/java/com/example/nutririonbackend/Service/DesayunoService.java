package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.DesayunoInterfaz;
import com.example.nutririonbackend.Model.Desayuno;
import com.example.nutririonbackend.Repository.DesayunoRepository;

@Service
public class DesayunoService implements DesayunoInterfaz{

    @Autowired
    private DesayunoRepository desayuno;

    @Override
    public List<Desayuno> getAllDesayuno() {
        return desayuno.findAll();
    }

    @Override
    public Desayuno saveDesayuno(Desayuno desayu) {
        return desayuno.save(desayu);
    }

    @Override
    public Optional<Desayuno> findById(int id) {
        return desayuno.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        desayuno.deleteById(id);
        
    }
    
}