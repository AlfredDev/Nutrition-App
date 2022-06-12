package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.Consulta;


@Repository
public interface CosultaRepository extends JpaRepository<Consulta,Integer>{
    
}
