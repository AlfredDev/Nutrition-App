package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.Model.DatosAntropometricos;
import com.example.nutririonbackend.Repository.DatoAntroRepo;
import com.example.nutririonbackend.Repository.ExpedienteRepo;
import com.example.nutririonbackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datoAntro")
@CrossOrigin
public class DatoAntroController {

    @Autowired
    private DatoAntroRepo datoAntroRepo;

    @Autowired
    private ExpedienteRepo expedienteRepo;

    @PostMapping("/addDatoantro/{id}/data")
    public ResponseEntity<DatosAntropometricos> createDatosAntropometricos(@PathVariable(value = "id") int idExpediente, @RequestBody DatosAntropometricos commentRequest) throws Exception {
        DatosAntropometricos datosAntropometricos = expedienteRepo.findById(idExpediente).map(expediente -> {
            commentRequest.setExpediente(expediente);
            return datoAntroRepo.save(commentRequest);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found Expediente with id = " + idExpediente));
        return new ResponseEntity<>(datosAntropometricos, HttpStatus.CREATED);

    }


    @GetMapping("/getDatoantro/{id}/datoAntro")
    public ResponseEntity<List<DatosAntropometricos>> getAllDatosAntropometricos(@PathVariable(value = "id") int idExpediente) {
        if (!expedienteRepo.existsById(idExpediente)) {
            throw new ResourceNotFoundException("Not found Expediente with id = " + idExpediente);
        }

        List<DatosAntropometricos> datosAntropometricos = datoAntroRepo.findByExpedienteId(idExpediente);
        return new ResponseEntity<>(datosAntropometricos, HttpStatus.OK);
    }


    @GetMapping("/getDatoAntroByID/{id}")
    public ResponseEntity<DatosAntropometricos> getDatosAntropometricosById(@PathVariable(value = "id") int id) {
        DatosAntropometricos comment = datoAntroRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not found Comment with id = " + id));

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }


}
