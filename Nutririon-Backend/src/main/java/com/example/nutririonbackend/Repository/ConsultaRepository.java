package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta,Integer> {
}
