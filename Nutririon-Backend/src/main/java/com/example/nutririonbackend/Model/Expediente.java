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
    InformacionGeneral InformacionGeneral = new InformacionGeneral(0,"","","","");
    @OneToOne(cascade = CascadeType.ALL)
    HistoriaPersonalSocial historiaPersonalSocial = new HistoriaPersonalSocial(0,"","","","","");
    public Expediente() {
    }
}
