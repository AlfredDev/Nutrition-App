package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nutririonbackend.Model.Cena;

@Repository
public interface CenaRepository extends JpaRepository<Cena,Integer> {

}
