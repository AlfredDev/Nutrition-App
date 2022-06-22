package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.DatosAntropometricos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DatoAntroRepo extends JpaRepository<DatosAntropometricos,Integer> {
    List<DatosAntropometricos> findByExpedienteId(Integer id);
}
