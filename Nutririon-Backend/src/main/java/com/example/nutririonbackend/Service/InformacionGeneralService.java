package com.example.nutririonbackend.Service;

import com.example.nutririonbackend.InterfaceService.InformacionGeneralInterface;
import com.example.nutririonbackend.Model.*;
import com.example.nutririonbackend.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InformacionGeneralService implements InformacionGeneralInterface{
    @Autowired
    InformacionGeneralRepo data;
    @Autowired
    HistoriaClinicalRepo dataRepo;
    @Autowired
    HistoriaAlimentariaRepo repoAlimeto;
    @Autowired
    HistoriaPersonalSocialRepo repoSocial;
    @Autowired
    ObersvacionesRepo opRepo;

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
    public String saveHistory(HistoriaClinica historiaPersonalSocial) {
        dataRepo.save(historiaPersonalSocial);
        return "Agragado";
    }

    @Override
    public Optional<HistoriaClinica> historiaClinicagetById(int id) {
        return dataRepo.findById(id);
    }

    @Override
    public String saveHistoryAlimentaria(HistoriaAlimentaria historiaAlimentaria) {
        repoAlimeto.save(historiaAlimentaria);
        return "Agregados";
    }

    @Override
    public Optional<HistoriaAlimentaria> historiaAlimentariagetById(int id) {
        return repoAlimeto.findById(id);
    }

    @Override
    public String saveHistoriaPersonal(HistoriaPersonalSocial historiaPersonalSocial) {
        repoSocial.save(historiaPersonalSocial);
        return "AGREGADO";
    }

    @Override
    public Optional<HistoriaPersonalSocial> historiaPersonalSocial(int id) {
        return repoSocial.findById(id);
    }

    @Override
    public String saveObercacion(Observaciones Observaciones) {
        opRepo.save(Observaciones);
        return "AGREAGDO";
    }

    @Override
    public Optional<Observaciones> observaciongetByid(int id) {
        return opRepo.findById(id);
    }
}
