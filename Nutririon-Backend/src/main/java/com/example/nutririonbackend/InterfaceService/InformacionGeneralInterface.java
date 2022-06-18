package com.example.nutririonbackend.InterfaceService;


import com.example.nutririonbackend.Model.InformacionGeneral;

import java.util.Optional;

public interface InformacionGeneralInterface {

    public Optional<InformacionGeneral> listarId(int id);
    public  String save(InformacionGeneral i);
    public  InformacionGeneral getById(int id);
}


