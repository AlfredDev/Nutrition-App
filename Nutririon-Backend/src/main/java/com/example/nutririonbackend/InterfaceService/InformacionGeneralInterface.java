/**
 * Creacion de la interfas de la informacion general con parametros
 *
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */
package com.example.nutririonbackend.InterfaceService;


import com.example.nutririonbackend.Model.*;

import java.util.Optional;

public interface InformacionGeneralInterface {

    //Parametros
    /*
    * Listar Id
    */
    public Optional<InformacionGeneral> listarId(int id);
    public  String save(InformacionGeneral i);
    public  InformacionGeneral getById(int id);

    /*
     *Para historial personal
     */
    public String saveHistory(HistoriaClinica historiaPersonalSocial);
    public Optional<HistoriaClinica> historiaClinicagetById(int id);

    /*
     *Para historial alimentario
     */
    public String saveHistoryAlimentaria(HistoriaAlimentaria historiaAlimentaria);
    public Optional<HistoriaAlimentaria> historiaAlimentariagetById(int id);

    /*
     *Para historial personal y social
     */

    public String saveHistoriaPersonal(HistoriaPersonalSocial historiaPersonalSocial);
    public Optional<HistoriaPersonalSocial> historiaPersonalSocial(int id);


    /*
     *Para observaciones
     */

    public String saveObercacion(Observaciones Observaciones);
    public Optional<Observaciones> observaciongetByid(int id);
}


