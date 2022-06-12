package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.PlanAlimenticio;

@Repository
public interface PlanAlimenticioRepository extends JpaRepository<PlanAlimenticio,Integer> {
    
}
