package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nutririonbackend.Model.Analiticos;

@Repository
public interface AnaliticosRepository extends JpaRepository<Analiticos,Integer>{
    
}
