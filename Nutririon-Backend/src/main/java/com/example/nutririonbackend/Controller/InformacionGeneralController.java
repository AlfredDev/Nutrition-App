
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
/**
 * En esta clase se crean los servicios para manipular desde el controlador
 * Esta clase contiene los metodos basicos de un CRUD
 *
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */
@RestController
@RequestMapping("/expediente")
@CrossOrigin
public class InformacionGeneralController {
    @Autowired
    private InformacionGeneralInterface service;

    @Autowired
    private PacienteInterfaz paciente_interfaz;

    /**
     * Edicion de datos
     * @param id id de la informacion general
     * @param model modelo de la informacion
     * @return estado de los datos
     * */
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
    /**
     * Agrega informacion
     * @param infdato informacion general
     * @return Informacion guardada
     * */
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

    /**
     * Agrega informacion
     * @param id id de la informacion general
     * @return lita de id
     * */
    @GetMapping("/findById/{id}")
    public Optional<InformacionGeneral> findById(@PathVariable int id) {
        return service.listarId(id);
    }
    /**
     * busca historia clinica
     * @param id id del historial personal
     * @return histroial clinico del id
     * */
    @GetMapping("/historiafindById/{id}")
    public Optional<HistoriaClinica> historiafindById(@PathVariable int id) {
        return service.historiaClinicagetById(id);
    }

    /**
     * Agrega historial personal
     * @param infdato id del historial personal general
     * @return Historial personal
     * */

    @PostMapping("/addHistoriaPersonal")
    public String addHistoriaPersonal(@RequestBody HistoriaClinica infdato) {
        return service.saveHistory(infdato);
    }
    /**
     * Editar historial personal
     * @param id id del historial clinico general
     *  @param model id del historial clinico general
     * @return Historial personal
     * */
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
    /**
     * Agreaar historial alimentario
     * @param infdato informacion de historial alimentario
     * @return Historial alimentario
     * */
    @PostMapping("/addHistorialAlimento")
    public String addHistorialAlimento(@RequestBody HistoriaAlimentaria infdato) {
        return service.saveHistoryAlimentaria(infdato);
    }
    /**
     * editar historial alimentario
     * @param id id de historial alimentario
     * @param model modelo de historial alimentario
     * @return Historial alimentario
     * */
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
    /**
     * Buscar historial alimentario
     * @param id id de historial alimentario
     * @return ID de Historial alimentario
     * */
    @GetMapping("/historiaAliementariGetby/{id}")
    public Optional<HistoriaAlimentaria> historiaAlimentariafindById(@PathVariable int id) {
        return service.historiaAlimentariagetById(id);
    }

    /**
     * Buscar historial personal social
     * @param id id de historial personal social
     * @return ID de Historial personal social
     * */

    @GetMapping("/historiaSocialgetByid/{id}")
    public Optional<HistoriaPersonalSocial> historiaPersonalSocialGetbyById(@PathVariable int id) {
        return service.historiaPersonalSocial(id);
    }
    /**
     * agregar historial personal social
     * @param infdato informacoin de historial personal social
     * @return informacio de Historial personal social
     * */

    @PostMapping("/addHistoriaSocial")
    public String addHistoriaSocial(@RequestBody HistoriaPersonalSocial infdato) {
        return service.saveHistoriaPersonal(infdato);
    }

    /**
     * Editar historial personal social
     * @param id id informacoin de historial personal social
     * @param model modelo informacoin de historial personal social
     * @return <ul>
     *     <li>true: historial personal guardado</li>
     *     <li>false: historial personal no guardado</li>
     * </ul>
     * */

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

    /**
     * Buscar Observaciones
     * @param id id de observaciones
     * @return observacion encontrada
     * */
    @GetMapping("/observaciongetByid/{id}")
    public Optional<Observaciones> observaciongetByid(@PathVariable int id) {
        return service.observaciongetByid(id);
    }

    /**
     * Agregar Observaciones
     * @param infdato id de observaciones
     * @return Guardar informacion
     * */

    @PostMapping("/addObservacion")
    public String addObservacion(@RequestBody Observaciones infdato) {
        return service.saveObercacion(infdato);
    }

    /**
     * Editar observaciones
     * @param id id de observaciones
     * @param model modelo de observaciones
     * @return <ul>
     *     <li>true: observaciones guardado</li>
     *     <li>false: observaciones no guardado</li>
     * </ul>
     *
     * */

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
