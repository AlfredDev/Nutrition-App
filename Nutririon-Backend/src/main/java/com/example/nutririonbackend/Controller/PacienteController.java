package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.InterfaceService.PacienteInterfaz;
import com.example.nutririonbackend.Model.DireccionPaciente;
import com.example.nutririonbackend.Model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
@CrossOrigin
public class PacienteController {
    @Autowired
    private PacienteInterfaz paciente_interfaz;

    @PostMapping("/addPaciente")
    public  String addPaciente(@RequestBody Paciente paciente){
        paciente_interfaz.savePaciente(paciente);
        return "Paciente agregado";
    }

    @GetMapping("/getAllPacientes")
    public List<Paciente> getAllPacientes(){
        return paciente_interfaz.getAllPacientes();
    }
}
