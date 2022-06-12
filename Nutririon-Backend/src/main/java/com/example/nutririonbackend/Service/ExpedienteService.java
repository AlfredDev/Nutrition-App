package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.ExpedienteInterfaz;
import com.example.nutririonbackend.Model.Expediente;
import com.example.nutririonbackend.Repository.ExpedienteRepository;

@Service
public class ExpedienteService implements ExpedienteInterfaz{
   
    @Autowired
    private ExpedienteRepository expediente;

    @Override
    public List<Expediente> getAllExpediente() {
        return expediente.findAll();
    }

    @Override
    public Expediente saveExpediente(Expediente expedient) {
        return expediente.save(expedient);
    }

    @Override
    public Optional<Expediente> findById(int id) {
        return expediente.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        expediente.deleteById(id);
        
    }

}
