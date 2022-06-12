package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nutririonbackend.Model.ActividadFisica;

@Repository
public interface ActividadFisicaRepository extends JpaRepository<ActividadFisica,Integer>{
    
}
