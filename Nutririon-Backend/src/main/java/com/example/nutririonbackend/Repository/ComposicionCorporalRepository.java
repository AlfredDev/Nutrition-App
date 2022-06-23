package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.ComposicionCorporal;
import com.example.nutririonbackend.Model.DatosAnaliticos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComposicionCorporalRepository extends JpaRepository<ComposicionCorporal, Integer> {
    List<ComposicionCorporal> findByExpedienteId(Integer id);

}
