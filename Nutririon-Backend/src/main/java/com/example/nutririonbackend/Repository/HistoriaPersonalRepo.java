package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.HistoriaPersonalSocial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriaPersonalRepo extends JpaRepository<HistoriaPersonalSocial,Integer> {
}
