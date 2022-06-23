package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.Model.DatosAnaliticos;
import com.example.nutririonbackend.Repository.DatosAnaliticosRepository;
import com.example.nutririonbackend.Repository.ExpedienteRepo;
import com.example.nutririonbackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datoAnalitico")
@CrossOrigin
public class DatoAnaliticoController {
    @Autowired
    private DatosAnaliticosRepository aliticoRepository;
    @Autowired
    private ExpedienteRepo expedienteRepo;

    @PostMapping("/addDatoAnalitico/{id}/data")
    public ResponseEntity<DatosAnaliticos> createDatosAnaliticos(@PathVariable(value = "id") int idExpediente, @RequestBody DatosAnaliticos commentRequest) throws Exception {
        DatosAnaliticos datoAnalitico = expedienteRepo.findById(idExpediente).map(expediente -> {
            commentRequest.setExpediente(expediente);
            return aliticoRepository.save(commentRequest);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found Expediente with id = " + idExpediente));
        return new ResponseEntity<>(datoAnalitico, HttpStatus.CREATED);

    }

    @GetMapping("/getDatoAnalitico/{id}/datoAnalitico")
    public ResponseEntity<List<DatosAnaliticos>> getAllDatosAnaliticos(@PathVariable(value = "id") int idExpediente) {
        if (!expedienteRepo.existsById(idExpediente)) {
            throw new ResourceNotFoundException("Not found Expediente with id = " + idExpediente);
        }

        List<DatosAnaliticos> datosAnaliticos = aliticoRepository.findByExpedienteId(idExpediente);
        return new ResponseEntity<>(datosAnaliticos, HttpStatus.OK);
    }

    @GetMapping("/getDatoAnaliticoByID/{id}")
    public ResponseEntity<DatosAnaliticos> getDatosAnaliticosById(@PathVariable(value = "id") int id) {
        DatosAnaliticos comment = aliticoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not found Comment with id = " + id));

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

}
