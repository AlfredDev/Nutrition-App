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

import com.example.nutririonbackend.InterfaceService.ExpedienteInterfaz;
import com.example.nutririonbackend.InterfaceService.PlanAlimenticioInterfaz;
import com.example.nutririonbackend.Model.Expediente;
import com.example.nutririonbackend.Model.PlanAlimenticio;



@RestController
@RequestMapping("/PlanAlimenticio")
@CrossOrigin
public class PlanAlimenticioController {

    @Autowired
    private ExpedienteInterfaz expe_interfaz;

    @Autowired
    private PlanAlimenticioInterfaz plana_interfaz;

    @Autowired
    private CenaInterfaz cna_interfaz;
    
    @Autowired
    private MeriendaInterfaz mri_interfaz;

    @Autowired
    private ComidaInterfaz cmi_interfaz;

    @Autowired
    private MediaMañanaInterfaz mdi_interfaz;

    @Autowired
    private DesayunoInterfaz des_interfaz;

    @PostMapping("/addPlanAlimenticio")
    public String addPlanAlimenticio(@RequestBody PlanAlimenticio planAlimenticio){

        Expediente exp = expe_interfaz.getId(planAlimenticio.getIdExpediente());
        Cena ce = cna_interfaz.getId(planAlimenticio.getIdCena());
        Merienda me = mri_interfaz.getId(planAlimenticio.getIdMerienda());
        Comida co = cmi_interfaz.getId(planAlimenticio.getIdComida());
        MediaMañana ma = mdi_interfaz.getId(planAlimenticio.getIdMManana());
        Desayuno de = des_interfaz.getId(planAlimenticio.getIdDesayuno());
        


        PlanAlimenticio pl=new PlanAlimenticio();
        p1.setIdExpediente(ce);
        p1.setIdDesayuno(ce);
        p1.setIdMManana(me);
        p1.setIdComida(co);
        p1.setIdMerienda(ma);
        p1.setIdCena(de);

        plana_interfaz.saveExpediente(p1);

        return "Plan Alimenticio Agregado registrado";
    }

    @GetMapping("/getAllPlanAlimenticio")
    public List<PlanAlimenticio> getAllPlanAlimenticio(){
        return plana_interfaz.getAllPlanAlimenticio();
    }

    @GetMapping("/findById/{id}")
    public Optional<PlanAlimenticio> findById(@PathVariable int id){
        return plana_interfaz.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        plana_interfaz.deletedByid(id);
    }
}
