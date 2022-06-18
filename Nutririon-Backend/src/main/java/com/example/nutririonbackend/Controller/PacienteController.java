package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.DTO.PacienteDto;
import com.example.nutririonbackend.InterfaceService.PacienteInterfaz;
import com.example.nutririonbackend.Model.DireccionPaciente;
import com.example.nutririonbackend.Model.Expediente;
import com.example.nutririonbackend.Model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")
@CrossOrigin
public class PacienteController {
    @Autowired
    private PacienteInterfaz paciente_interfaz;

    @PostMapping("/addPaciente")
    public String addPaciente(@RequestBody PacienteDto pacienteDto) {
        System.out.println("paciente: " + pacienteDto);

        Paciente paciente = new Paciente();
        paciente.setNombre(pacienteDto.getNombre());
        paciente.setGenero(pacienteDto.getGenero());
        paciente.setOcupacion(pacienteDto.getOcupacion());
        paciente.setFechaNacimiento(pacienteDto.getFechaNacimiento());
        paciente.setExpediente(new Expediente());

        DireccionPaciente direccionPaciente = new DireccionPaciente();
        direccionPaciente.setCorreo(pacienteDto.getCorreo());
        direccionPaciente.setLugarConsulta(pacienteDto.getLugarConsulta());
        direccionPaciente.setCodigoPostal(pacienteDto.getCodigoPostal());
        direccionPaciente.setPaisResidencia(pacienteDto.getPaisResidencia());
        direccionPaciente.setTelefono(pacienteDto.getTelefono());
        direccionPaciente.setIncorporacion(new Date());
        paciente.setDireccionPaciente(direccionPaciente);

        paciente_interfaz.savePaciente(paciente);

        return "Paciente agregado";
    }

    @GetMapping("/getAllPacientes")
    public List<Paciente> getAllPacientes(){
        return paciente_interfaz.getAllPacientes();
    }

    @GetMapping("/findById/{id}")
    public Optional<Paciente> findById(@PathVariable int id){
        return paciente_interfaz.findById(id);
    }



}