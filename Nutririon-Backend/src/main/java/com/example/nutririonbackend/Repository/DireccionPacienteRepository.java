package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.DireccionPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionPacienteRepository extends JpaRepository<DireccionPaciente,Integer> {
}
