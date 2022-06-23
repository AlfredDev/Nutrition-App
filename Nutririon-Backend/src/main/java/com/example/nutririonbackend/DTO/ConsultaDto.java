package com.example.nutririonbackend.DTO;

import lombok.Data;

import java.util.Date;
/**
 * En esta clase se crean declaraciones de datos
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */

@Data
public class ConsultaDto {
    //Atributos

/**
 * se declara la fecha de inicio de la consulta
 * */
    Date inicio_consulta;
 /**
  * declara la fecha del final de la consulta
  * */
    Date fin_consulta;
/**
 *  declara el estado de la consulta
 * */
    String estatus;
   /**
    * recibe una liga para una consulta online
    * */
    String liga_video;
    private String lugarConsulta;

    int idPacient;

}
