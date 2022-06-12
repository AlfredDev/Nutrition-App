package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.Alimentos;

@Repository
public interface AlimentosRepository extends JpaRepository<Alimentos,Integer> {

}
