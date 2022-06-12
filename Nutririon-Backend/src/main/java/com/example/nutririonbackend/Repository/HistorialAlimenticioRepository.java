package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.HistorialAlimenticio;

@Repository
public interface HistorialAlimenticioRepository extends JpaRepository<HistorialAlimenticio,Integer>{
    
}
