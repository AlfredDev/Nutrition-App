package com.example.nutririonbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nutririonbackend.Model.MediaManana;

@Repository
public interface MediaMananaRepository extends JpaRepository<MediaManana,Integer> {

}