package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.Expediente;

@Repository
public interface ExpedienteRepository extends JpaRepository<Expediente,Integer> {
    
}
