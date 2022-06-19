package com.example.nutririonbackend.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@ToString

public class HistoriaAlimentaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
