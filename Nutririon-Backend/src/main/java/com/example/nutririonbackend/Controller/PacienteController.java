/**
 * En esta clase se crean los servicios para manipular desde el controlador
 * Esta clase contiene los metodos basicos de un CRUD
 *
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */
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
/**
 * En esta clase se crean los servicios para manipular desde el controlador
 * Esta clase contiene los metodos basicos de un CRUD
 *
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */
@RestController
@RequestMapping("/paciente")
@CrossOrigin
public class PacienteController {
    @Autowired
    private PacienteInterfaz paciente_interfaz;
    /**
     * Edicion de datos
     * @param pacienteDto acepta informacion del paciente
     * @return regresa al paciente agregado
     * */
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
    /**
     *Generar una lista de pacientes
     * @return  regresa una lista de los pacientes
     * */
    @GetMapping("/getAllPacientes")
    public List<Paciente> getAllPacientes(){
        return paciente_interfaz.getAllPacientes();
    }
    /**
     * Buscar paciente
     * @param id id de paciente
     * @return paciente encontrado
     * */
    @GetMapping("/findById/{id}")
    public Optional<Paciente> findById(@PathVariable int id){
        return paciente_interfaz.findById(id);
    }


}
