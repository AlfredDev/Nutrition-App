/**
 * Creacion de la interfas consulta con parametros
 *
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */
package com.example.nutririonbackend.InterfaceService;

import com.example.nutririonbackend.Model.Consulta;

import java.util.List;
import java.util.Optional;

public interface ConsultaInterface {

    //Metodos
    /**
     * Creacion de lista de consultas
     */
    public List<Consulta> getAllConsultas();
    /**
     * Mandar objeto consultas a metodo guaradar consulta
     */
    public Consulta saveConsultas(Consulta consulta);
    /**
     * Creacio de busqueda por id
     */
    public Optional<Consulta> findById(int id);

}
