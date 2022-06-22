package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.Expediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpedienteRepo extends JpaRepository<Expediente,Integer> {

}
