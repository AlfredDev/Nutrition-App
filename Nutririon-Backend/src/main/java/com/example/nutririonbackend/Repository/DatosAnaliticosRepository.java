package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.DatosAnaliticos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface DatosAnaliticosRepository extends JpaRepository<DatosAnaliticos,Integer> {
    List<DatosAnaliticos> findByExpedienteId(Integer id);

}
