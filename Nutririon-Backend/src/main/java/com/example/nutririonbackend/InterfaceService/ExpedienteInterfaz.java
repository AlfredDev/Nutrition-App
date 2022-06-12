package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.Expediente;

public interface ExpedienteInterfaz {
    public List<Expediente> getAllExpediente();
    public Expediente saveExpediente(Expediente expediente);
    public Optional<Expediente> findById(int id);
    public void deletedByid(int id);
}
