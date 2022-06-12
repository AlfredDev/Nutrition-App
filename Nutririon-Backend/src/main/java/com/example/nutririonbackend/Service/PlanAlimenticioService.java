package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.PlanAlimenticioInterfaz;
import com.example.nutririonbackend.Model.PlanAlimenticio;
import com.example.nutririonbackend.Repository.PlanAlimenticioRepository;

@Service
public class PlanAlimenticioService implements PlanAlimenticioInterfaz{
    
    @Autowired
    private PlanAlimenticioRepository planAlimenticio;

    @Override
    public List<PlanAlimenticio> getAllPlanAlimenticio() {
        return planAlimenticio.findAll();
    }

    @Override
    public PlanAlimenticio savePlanAlimenticio(PlanAlimenticio planAlimentic) {
        return planAlimenticio.save(planAlimentic);
    }

    @Override
    public Optional<PlanAlimenticio> findById(int id) {
        return planAlimenticio.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        planAlimenticio.deleteById(id);
        
    }

}
