package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.Historial;

@Repository
public interface HistorialRepository extends JpaRepository<Historial,Integer> {
    
}
