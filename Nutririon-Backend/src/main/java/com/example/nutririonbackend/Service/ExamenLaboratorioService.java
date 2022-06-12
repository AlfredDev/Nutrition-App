package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.ExamenLaboratorioInterfaz;
import com.example.nutririonbackend.Model.ExamenLaboratorio;
import com.example.nutririonbackend.Repository.ExamenLaboratorioRepository;

@Service
public class ExamenLaboratorioService implements ExamenLaboratorioInterfaz{

    @Autowired
    private ExamenLaboratorioRepository examenLaboratorio;

    @Override
    public List<ExamenLaboratorio> getAllExamenLaboratorio() {
        return examenLaboratorio.findAll();
    }

    @Override
    public ExamenLaboratorio saveExamenLaboratorio(ExamenLaboratorio examenLaborator) {
        return examenLaboratorio.save(examenLaborator);
    }

    @Override
    public Optional<ExamenLaboratorio> findById(int id) {
        return examenLaboratorio.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        examenLaboratorio.deleteById(id);
        
    }

}
