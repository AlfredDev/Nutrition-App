package com.example.nutririonbackend.Repository;

import com.example.nutririonbackend.Model.InformacionGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InformacionGeneralRepo extends JpaRepository<InformacionGeneral,Integer> {
}
