package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.DTO.Infodato;
import com.example.nutririonbackend.InterfaceService.InformacionGeneralInterface;
import com.example.nutririonbackend.InterfaceService.PacienteInterfaz;
import com.example.nutririonbackend.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Optional<HistoriaClinica> historiafindById(@PathVariable int id) {
        return service.historiaClinicagetById(id);
    }

    // Historia clinica

    @PostMapping("/addHistoriaPersonal")
    public String addHistoriaPersonal(@RequestBody HistoriaClinica infdato) {
        return service.saveHistory(infdato);
    }

    @PutMapping("/editarHistoria/{id}")
    public ResponseEntity<HistoriaClinica> editar(@PathVariable("id") int id, @RequestBody HistoriaClinica model) {
        Optional<HistoriaClinica> historiaPersonalSocial = service.historiaClinicagetById(id);
        if (historiaPersonalSocial.isPresent()) {
            HistoriaClinica _info = historiaPersonalSocial.get();
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

    /// Historia alimentaria section
    @PostMapping("/addHistorialAlimento")
    public String addHistorialAlimento(@RequestBody HistoriaAlimentaria infdato) {
        return service.saveHistoryAlimentaria(infdato);
    }

    @PutMapping("/editarHistoriaAlimento/{id}")
    public ResponseEntity<HistoriaAlimentaria> editar(@PathVariable("id") int id, @RequestBody HistoriaAlimentaria model) {
        Optional<HistoriaAlimentaria> historiaAlimentaria = service.historiaAlimentariagetById(id);
        if (historiaAlimentaria.isPresent()) {
            HistoriaAlimentaria _info = historiaAlimentaria.get();
            _info.setHoraLevantarse(model.getHoraLevantarse());
            _info.setHoraAcostarse(model.getHoraAcostarse());
            _info.setTipoDieta(model.getTipoDieta());
            _info.setAlimentoFavorito(model.getAlimentoFavorito());
            _info.setAlimentoRechazado(model.getAlimentoRechazado());
            _info.setAlergia(model.getAlergia());
            _info.setIntoleranciaAlimentaria(model.getIntoleranciaAlimentaria());
            _info.setDeficienciasNutricionales(model.getDeficienciasNutricionales());
            _info.setIngestaAgua(model.getIngestaAgua());
            _info.setOtraInformacion(model.getOtraInformacion());

            return new ResponseEntity(service.saveHistoryAlimentaria(_info), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/historiaAliementariGetby/{id}")
    public Optional<HistoriaAlimentaria> historiaAlimentariafindById(@PathVariable int id) {
        return service.historiaAlimentariagetById(id);
    }

    /// Historia Personal Social

    @GetMapping("/historiaSocialgetByid/{id}")
    public Optional<HistoriaPersonalSocial> historiaPersonalSocialGetbyById(@PathVariable int id) {
        return service.historiaPersonalSocial(id);
    }

    @PostMapping("/addHistoriaSocial")
    public String addHistoriaSocial(@RequestBody HistoriaPersonalSocial infdato) {
        return service.saveHistoriaPersonal(infdato);
    }

    @PutMapping("/editarHistoriaSocial/{id}")
    public ResponseEntity<HistoriaPersonalSocial> editar(@PathVariable("id") int id, @RequestBody HistoriaPersonalSocial model) {
        Optional<HistoriaPersonalSocial> historiaPersonalSocial = service.historiaPersonalSocial(id);
        if (historiaPersonalSocial.isPresent()) {
            HistoriaPersonalSocial _info = historiaPersonalSocial.get();
            _info.setFuncionIntestinal(model.getFuncionIntestinal());
            _info.setCalidadSueño(model.getCalidadSueño());
            _info.setFumador(model.getFumador());
            _info.setBebeAlcohol(model.getBebeAlcohol());
            _info.setEstadoCivil(model.getEstadoCivil());
            _info.setActividadFisica(model.getActividadFisica());

            _info.setOtraInformacion(model.getOtraInformacion());

            return new ResponseEntity(service.saveHistoriaPersonal(_info), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }


    ///Observaciones
    @GetMapping("/observaciongetByid/{id}")
    public Optional<Observaciones> observaciongetByid(@PathVariable int id) {
        return service.observaciongetByid(id);
    }

    @PostMapping("/addObservacion")
    public String addObservacion(@RequestBody Observaciones infdato) {
        return service.saveObercacion(infdato);
    }

    @PutMapping("/editObservacion/{id}")
    public ResponseEntity<Observaciones> editar(@PathVariable("id") int id, @RequestBody Observaciones model) {
        Optional<Observaciones> observaciones = service.observaciongetByid(id);
        if (observaciones.isPresent()) {
            Observaciones _info = observaciones.get();
            _info.setObservaciones(model.getObservaciones());


            return new ResponseEntity(service.saveObercacion(_info), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
}
