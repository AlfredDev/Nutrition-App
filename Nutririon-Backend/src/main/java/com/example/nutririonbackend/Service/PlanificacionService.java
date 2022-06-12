package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.PlanificacionInterfaz;
import com.example.nutririonbackend.Model.Planificacion;
import com.example.nutririonbackend.Repository.PlanificacionRepository;

@Service
public class PlanificacionService implements PlanificacionInterfaz{

    @Autowired
    private PlanificacionRepository planificacion;

    @Override
    public List<Planificacion> getAllPlanificacion() {
        return planificacion.findAll();
    }

    @Override
    public Planificacion savePlanAlimenticio(Planificacion planificaci) {
        return planificacion.save(planificaci);
    }

    @Override
    public Optional<Planificacion> findById(int id) {
        return planificacion.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        planificacion.deleteById(id);
        
    }


    
}
