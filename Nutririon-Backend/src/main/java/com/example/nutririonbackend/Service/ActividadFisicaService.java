package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.ActividadFisicaInterfaz;
import com.example.nutririonbackend.Model.ActividadFisica;
import com.example.nutririonbackend.Repository.ActividadFisicaRepository;


@Service
public class ActividadFisicaService implements ActividadFisicaInterfaz{
    @Autowired
    private ActividadFisicaRepository actividadFisica;

    @Override
    public List<ActividadFisica> getAllActividades() {
        return actividadFisica.findAll();
    }

    @Override
    public ActividadFisica saveActividad(ActividadFisica acti) {
        return actividadFisica.save(acti);
    }

    @Override
    public Optional<ActividadFisica> findById(int id) {
        return actividadFisica.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        actividadFisica.deleteById(id);
        
    }
}
