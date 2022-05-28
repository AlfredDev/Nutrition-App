package com.example.nutririonbackend.Service;

import com.example.nutririonbackend.InterfaceService.PacienteInterfaz;
import com.example.nutririonbackend.Model.DireccionPaciente;
import com.example.nutririonbackend.Model.Paciente;
import com.example.nutririonbackend.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements PacienteInterfaz {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente savePaciente(Paciente paciente) {
        DireccionPaciente direccionPaciente = paciente.getDireccionPaciente();
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente getByid(int id) {
        return null;
    }
}
