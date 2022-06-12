package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.DireccionPacienteInterfaz;
import com.example.nutririonbackend.Model.DireccionPaciente;
import com.example.nutririonbackend.Repository.DireccionPacienteRepository;

@Service
public class DireccionPacienteService implements DireccionPacienteInterfaz{
    
    @Autowired
    private DireccionPacienteRepository direccionPaciente;

    @Override
    public List<DireccionPaciente> getAllDireccionPaciente() {
        return direccionPaciente.findAll();
    }

    @Override
    public DireccionPaciente saveDireccionPaciente(DireccionPaciente direccionPacien) {
        return direccionPaciente.save(direccionPacien);
    }

    @Override
    public Optional<DireccionPaciente> findById(int id) {
        return direccionPaciente.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        direccionPaciente.deleteById(id);
        
    }
}
