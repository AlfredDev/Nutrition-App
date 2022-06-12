package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.Planificacion;

public interface PlanificacionInterfaz {
    public List<Planificacion> getAllPlanificacion();
    public Planificacion savePlanificacion(Planificacion planificacion);
    public Optional<Planificacion> findById(int id);
    public void deletedByid(int id);
}
