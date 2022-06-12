package com.example.nutririonbackend.InterfaceService;

import java.util.List;

import java.util.Optional;

import com.example.nutririonbackend.Model.ActividadFisica;

public interface ActividadFisicaInterfaz {
    public List<ActividadFisica> getAllActividades();
    public ActividadFisica saveActividad(ActividadFisica actividadFisica);
    public Optional<ActividadFisica> findById(int id);
    public void deletedByid(int id);
}
