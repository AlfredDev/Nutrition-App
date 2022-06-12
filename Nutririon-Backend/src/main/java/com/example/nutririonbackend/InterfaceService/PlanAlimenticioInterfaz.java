package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.PlanAlimenticio;

public interface PlanAlimenticioInterfaz {
    public List<PlanAlimenticio> getAllPlanAlimenticio();
    public PlanAlimenticio savePlanAlimenticio(PlanAlimenticio planAlimenticio);
    public Optional<PlanAlimenticio> findById(int id);
    public void deletedByid(int id);
}
