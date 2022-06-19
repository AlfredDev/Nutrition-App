package com.example.nutririonbackend.InterfaceService;


import com.example.nutririonbackend.Model.HistoriaPersonalSocial;
import com.example.nutririonbackend.Model.InformacionGeneral;

import java.util.Optional;

public interface InformacionGeneralInterface {

    public Optional<InformacionGeneral> listarId(int id);
    public  String save(InformacionGeneral i);
    public  InformacionGeneral getById(int id);

    // Para la historia personal
    public String saveHistory(HistoriaPersonalSocial historiaPersonalSocial);
    public Optional<HistoriaPersonalSocial> historiaPersonalSocialgetById(int id);

}


