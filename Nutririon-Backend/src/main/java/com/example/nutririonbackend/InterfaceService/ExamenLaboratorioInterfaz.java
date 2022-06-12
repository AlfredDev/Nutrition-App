package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.ExamenLaboratorio;

public interface ExamenLaboratorioInterfaz {
    public List<ExamenLaboratorio> getAllExamenLaboratorio();
    public ExamenLaboratorio saveExamenLaboratorio(ExamenLaboratorio examenLaboratorio);
    public Optional<ExamenLaboratorio> findById(int id);
    public void deletedByid(int id);
}
