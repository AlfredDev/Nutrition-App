package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.ComposicioncoporalInterfaz;
import com.example.nutririonbackend.Model.ComposicionCorporal;
import com.example.nutririonbackend.Repository.ComposicionCorporalRepository;

@Service
public class ComposicionCorporalService implements ComposicioncoporalInterfaz{

    @Autowired
    private ComposicionCorporalRepository composicionCorporal;

    @Override
    public List<ComposicionCorporal> getAllComposicionCorporal() {
        return composicionCorporal.findAll();
    }

    @Override
    public ComposicionCorporal saveComposicionCorporal(ComposicionCorporal composicionCorpor) {
        return composicionCorporal.save(composicionCorpor);
    }

    @Override
    public Optional<ComposicionCorporal> findById(int id) {
        return composicionCorporal.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        composicionCorporal.deleteById(id);
        
    }
    
}
