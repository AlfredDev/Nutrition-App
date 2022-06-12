package com.example.nutririonbackend.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nutririonbackend.DTO.HistorialDto;
import com.example.nutririonbackend.InterfaceService.HistorialAlimenticioInterfaz;
import com.example.nutririonbackend.InterfaceService.HistorialClinicoInterfaz;
import com.example.nutririonbackend.InterfaceService.HistorialInterfaz;
import com.example.nutririonbackend.Model.Historial;
import com.example.nutririonbackend.Model.HistorialAlimenticio;
import com.example.nutririonbackend.Model.HistorialClinico; 

@RestController
@RequestMapping("/Historial")
@CrossOrigin
public class HistorialController {
    @Autowired
    private HistorialInterfaz his_interfaz;
    @Autowired
    private HistorialClinicoInterfaz hisC_interfaz;
    @Autowired
    private HistorialAlimenticioInterfaz hisA_interfaz;

    @PostMapping("/addHistorial")
    public String addExpediente(@RequestBody HistorialDto his){

        HistorialAlimenticio hidA = hisA_interfaz.getId(his.getIDHistorialAlim());
        HistorialClinico hidC = hisC_interfaz.getId(his.getIDHistorialClinic());
        


        Historial histo=new Historial();
        histo.setBebeAlcohol(his.getBebeAlcohol());
        histo.setCalidadSueño(his.getCalidadSueño());
        histo.setEstadoCivil(his.getEstadoCivil());
        histo.setFumador(his.GetFumador());
        histo.setIDHistorialAlim(hidA);
        histo.setIDHistorialClinic(hidC);


        his_interfaz.saveHistorial(histo);

        return "Hitorial registrado";
    }

    @GetMapping("/getAllHistorial")
    public List<Historial> getAllHistorial(){
        return his_interfaz.getAllHistorial();
    }

    @GetMapping("/findById/{id}")
    public Optional<Historial> findById(@PathVariable int id){
        return his_interfaz.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        his_interfaz.deletedByid(id);
    }
}
