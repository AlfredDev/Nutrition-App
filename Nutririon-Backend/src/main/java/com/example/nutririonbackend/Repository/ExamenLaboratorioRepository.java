package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.ExamenLaboratorio;
@Repository
public interface ExamenLaboratorioRepository extends JpaRepository<ExamenLaboratorio,Integer>{
    
}
