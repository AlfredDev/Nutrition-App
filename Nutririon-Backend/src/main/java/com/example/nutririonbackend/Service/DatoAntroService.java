/**
 * En esta clase se crean los servicios para manipular desde el controlador
 * Esta clase contiene los metodos basicos de un CRUD
 *
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */

package com.example.nutririonbackend.Service;

import com.example.nutririonbackend.Model.DatosAntropometricos;
import com.example.nutririonbackend.Model.Expediente;
import com.example.nutririonbackend.Repository.DatoAntroRepo;
import com.example.nutririonbackend.Repository.ExpedienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatoAntroService {

    // instance variables - Instancias de las interfaces de JPaRepository que sirven para llamar a las funciones
    @Autowired
    DatoAntroRepo repository;
    @Autowired
    ExpedienteRepo EXPEDIENTE_REPO;

    /**
     * @param id id del expediente a instanciar
     * @return Una instancia de un expediente, de acuerdo al id
     */
    public Expediente getExpedientebyId(int id) {
        return EXPEDIENTE_REPO.getById(id);
    }

    public void saveDatosAntro(DatosAntropometricos d) {
        repository.save(d);
    }

}
