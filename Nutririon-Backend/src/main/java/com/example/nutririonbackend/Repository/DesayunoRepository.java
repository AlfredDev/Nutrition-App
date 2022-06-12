package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nutririonbackend.Model.Desayuno;

@Repository
public interface DesayunoRepository extends JpaRepository<Desayuno,Integer> {

}
