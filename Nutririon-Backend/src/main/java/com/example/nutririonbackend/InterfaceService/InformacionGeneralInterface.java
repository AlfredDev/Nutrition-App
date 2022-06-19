package com.example.nutririonbackend.InterfaceService;


import com.example.nutririonbackend.Model.*;

import java.util.Optional;

public interface InformacionGeneralInterface {

    public Optional<InformacionGeneral> listarId(int id);
    public  String save(InformacionGeneral i);
    public  InformacionGeneral getById(int id);

    // Para la historia personal
    public String saveHistory(HistoriaClinica historiaPersonalSocial);
    public Optional<HistoriaClinica> historiaClinicagetById(int id);

    // Para la historia alimentaria
    public String saveHistoryAlimentaria(HistoriaAlimentaria historiaAlimentaria);
    public Optional<HistoriaAlimentaria> historiaAlimentariagetById(int id);

    // Para la historia personal y social

    public String saveHistoriaPersonal(HistoriaPersonalSocial historiaPersonalSocial);
    public Optional<HistoriaPersonalSocial> historiaPersonalSocial(int id);


    // Para las observaciones

    public String saveObercacion(Observaciones Observaciones);
    public Optional<Observaciones> observaciongetByid(int id);
}


