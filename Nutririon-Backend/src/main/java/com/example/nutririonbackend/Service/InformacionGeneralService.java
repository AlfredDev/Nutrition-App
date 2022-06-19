package com.example.nutririonbackend.Service;

import com.example.nutririonbackend.InterfaceService.InformacionGeneralInterface;
import com.example.nutririonbackend.Model.HistoriaPersonalSocial;
import com.example.nutririonbackend.Model.InformacionGeneral;
import com.example.nutririonbackend.Repository.HistoriaPersonalRepo;
import com.example.nutririonbackend.Repository.InformacionGeneralRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InformacionGeneralService implements InformacionGeneralInterface{
    @Autowired
    InformacionGeneralRepo data;
    @Autowired
    HistoriaPersonalRepo dataRepo;

    @Override
    public Optional<InformacionGeneral> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public String save(InformacionGeneral i) {
         data.save(i);
         return "Agregado";
    }

    @Override
    public InformacionGeneral getById(int id) {
        return  data.getById(id);
    }

    @Override
    public String saveHistory(HistoriaPersonalSocial historiaPersonalSocial) {
        dataRepo.save(historiaPersonalSocial);
        return "Agragado";
    }

    @Override
    public Optional<HistoriaPersonalSocial> historiaPersonalSocialgetById(int id) {
        return dataRepo.findById(id);
    }
}
