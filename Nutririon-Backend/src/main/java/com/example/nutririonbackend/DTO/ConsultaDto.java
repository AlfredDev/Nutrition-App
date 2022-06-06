package com.example.nutririonbackend.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ConsultaDto {

    Date inicio_consulta;
    Date fin_consulta;
    String estatus;
    String liga_video;
    private String lugarConsulta;

    int idPacient;

}
