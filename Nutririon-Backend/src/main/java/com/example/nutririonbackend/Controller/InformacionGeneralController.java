package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.DTO.Infodato;
import com.example.nutririonbackend.DTO.PacienteDto;
import com.example.nutririonbackend.InterfaceService.InformacionGeneralInterface;
import com.example.nutririonbackend.InterfaceService.PacienteInterfaz;
import com.example.nutririonbackend.Model.Expediente;
import com.example.nutririonbackend.Model.HistoriaPersonalSocial;
import com.example.nutririonbackend.Model.InformacionGeneral;
import com.example.nutririonbackend.Model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/expediente")
@CrossOrigin
public class InformacionGeneralController {
    @Autowired
    private InformacionGeneralInterface service;

    @Autowired
    private PacienteInterfaz paciente_interfaz;


    @PutMapping("/editar/{id}")
    public ResponseEntity<InformacionGeneral> editar(@PathVariable("id") int id, @RequestBody InformacionGeneral model) {
        Optional<InformacionGeneral> informacionGeneral = service.listarId(id);
        if (informacionGeneral.isPresent()) {
            InformacionGeneral _info = informacionGeneral.get();
            _info.setMotivoConsulta(model.getMotivoConsulta());
            _info.setExpectativas(model.getExpectativas());
            _info.setObjetivosClinicos(model.getObjetivosClinicos());
            _info.setOtraInformacion(model.getOtraInformacion());
            return new ResponseEntity(service.save(_info), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @PostMapping("/informacion")
    public String addInformacion(@RequestBody Infodato infdato) {
        Paciente paciente = paciente_interfaz.getPacienteId(infdato.getIdPacient());
        Expediente expediente = paciente.getExpediente();

        InformacionGeneral informacion = new InformacionGeneral();
        informacion.setMotivoConsulta(infdato.getMotivoConsulta());
        informacion.setExpectativas(infdato.getExpectativas());
        informacion.setObjetivosClinicos(infdato.getObjetivosClinicos());
        informacion.setOtraInformacion(infdato.getOtraInformacion());

        expediente.setInformacionGeneral(informacion);

        return service.save(informacion);

    }


    @GetMapping("/findById/{id}")
    public Optional<InformacionGeneral> findById(@PathVariable int id) {
        return service.listarId(id);
    }

    @GetMapping("/historiafindById/{id}")
    public Optional<HistoriaPersonalSocial> historiafindById(@PathVariable int id) {
        return service.historiaPersonalSocialgetById(id);
    }

    @PostMapping("/addHistoriaPersonal")
    public String addHistoriaPersonal(@RequestBody HistoriaPersonalSocial infdato) {
        return service.saveHistory(infdato);
    }

    @PutMapping("/editarHistoria/{id}")
    public ResponseEntity<HistoriaPersonalSocial> editar(@PathVariable("id") int id, @RequestBody HistoriaPersonalSocial model) {
        Optional<HistoriaPersonalSocial> historiaPersonalSocial = service.historiaPersonalSocialgetById(id);
        if (historiaPersonalSocial.isPresent()) {
            HistoriaPersonalSocial _info = historiaPersonalSocial.get();
            _info.setPatalogias(model.getPatalogias());
            _info.setMedicacion(model.getMedicacion());
            _info.setAntecedentePersonal(model.getAntecedentePersonal());
            _info.setAntecedenteFamiliar(model.getAntecedenteFamiliar());
            _info.setOtraInformacion(model.getOtraInformacion());

            return new ResponseEntity(service.saveHistory(_info), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }


}
