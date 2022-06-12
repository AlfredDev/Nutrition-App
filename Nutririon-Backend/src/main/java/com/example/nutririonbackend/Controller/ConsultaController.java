package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.DTO.ConsultaDto;
import com.example.nutririonbackend.DTO.PacienteDto;
import com.example.nutririonbackend.InterfaceService.ConsultaInterfaz;
import com.example.nutririonbackend.InterfaceService.ExpedienteInterfaz;
import com.example.nutririonbackend.InterfaceService.PacienteInterfaz;
import com.example.nutririonbackend.Model.Consulta;
import com.example.nutririonbackend.Model.Expediente;
import com.example.nutririonbackend.Model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")

@CrossOrigin
public class ConsultaController {

    @Autowired
    private PacienteInterfaz paciente_interfaz;

    @Autowired
    private ExpedienteInterfaz Expediente_interfaz;

    @Autowired
    private ConsultaInterfaz consultaInterface;

    @PostMapping("/addConsulta")
    public String addConsulta(@RequestBody ConsultaDto consulta) {

        Paciente paciente = paciente_interfaz.getId(consulta.getIdPacient());
        Expediente expediente = Expediente_interfaz.getId(consulta.getIDExpediente());

        Consulta cons = new Consulta();
        cons.setFin_consulta(consulta.getFin_consulta());
        cons.setInicio_consulta(consulta.getInicio_consulta());
        cons.setLugarConsulta(consulta.getLugarConsulta());
        cons.setEstatus(consulta.getEstatus());
        cons.setLiga_video(consulta.getLiga_video());
        cons.setIDpaciente(paciente);
        cons.setIDExpediente(expediente);

        consultaInterface.saveConsulta(cons);

        return "Consulta agregada";

    }

    @GetMapping("/getAllConsultas")
    public List<Consulta> getAllPacientes() {
        return consultaInterface.getAllConsulta();
    }

}
