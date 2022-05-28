package com.example.nutririonbackend.InterfaceService;

import com.example.nutririonbackend.Model.Paciente;
import com.example.nutririonbackend.Model.Usuario;

import java.util.List;

public interface PacienteInterfaz {
    public List<Paciente> getAllPacientes();
    public Paciente savePaciente(Paciente paciente);
    public Paciente getByid(int id);

}
