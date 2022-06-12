package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.DireccionPaciente;

public interface DireccionPacienteInterfaz {
    public List<DireccionPaciente> getAllDireccionPaciente();
    public DireccionPaciente saveDireccionPaciente(DireccionPaciente direccionPaciente);
    public Optional<DireccionPaciente> findById(int id);
    public void deletedByid(int id);
}
