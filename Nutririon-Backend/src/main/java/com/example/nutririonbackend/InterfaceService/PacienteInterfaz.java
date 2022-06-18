package com.example.nutririonbackend.InterfaceService;

import com.example.nutririonbackend.Model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteInterfaz {
    public List<Paciente> getAllPacientes();
    public Paciente savePaciente(Paciente paciente);
    public Optional<Paciente> findById(int id);
    public Paciente getPacienteId(int id);

}
