package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.Model.ComposicionCorporal;
import com.example.nutririonbackend.Repository.ComposicionCorporalRepository;
import com.example.nutririonbackend.Repository.ExpedienteRepo;
import com.example.nutririonbackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Composicion")
@CrossOrigin

public class ComposicionCorporalController {
    @Autowired
    private ExpedienteRepo expedienteRepo;
    @Autowired
    private ComposicionCorporalRepository composicionCorporalRepository;

    @PostMapping("/addComposicion/{id}/data")
    public ResponseEntity<ComposicionCorporal> createComposicionCorporal(@PathVariable(value = "id") int idExpediente, @RequestBody ComposicionCorporal commentRequest) throws Exception {
        ComposicionCorporal composicionCorporal = expedienteRepo.findById(idExpediente).map(expediente -> {
            commentRequest.setExpediente(expediente);
            return composicionCorporalRepository.save(commentRequest);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found Expediente with id = " + idExpediente));
        return new ResponseEntity<>(composicionCorporal, HttpStatus.CREATED);
    }

    @GetMapping("/getComposicion/{id}/composicion")
    public ResponseEntity<List<ComposicionCorporal>> getAllDatosAntropometricos(@PathVariable(value = "id") int idExpediente) {
        if (!expedienteRepo.existsById(idExpediente)) {
            throw new ResourceNotFoundException("Not found Expediente with id = " + idExpediente);
        }

        List<ComposicionCorporal> datosAntropometricos = composicionCorporalRepository.findByExpedienteId(idExpediente);
        return new ResponseEntity<>(datosAntropometricos, HttpStatus.OK);
    }

    @GetMapping("/getComposicionByID/{id}")
    public ResponseEntity<ComposicionCorporal> getComposicionByIDById(@PathVariable(value = "id") int id) {
        ComposicionCorporal comment = composicionCorporalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not found Comment with id = " + id));

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }


}
