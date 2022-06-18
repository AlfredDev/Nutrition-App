package com.example.nutririonbackend.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
public class Expediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    InformacionGeneral InformacionGeneral = new InformacionGeneral();

    public Expediente() {
    }
}
