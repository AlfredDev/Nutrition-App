package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.ComposicionCorporal;

@Repository
public interface ComposicionCorporalRepository extends JpaRepository<ComposicionCorporal,Integer>{
    
}
