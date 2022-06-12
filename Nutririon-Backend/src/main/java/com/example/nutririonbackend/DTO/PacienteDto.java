package com.example.nutririonbackend.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class PacienteDto {
    private String Nombre;
    private String Genero;
    private Date FechaNacimiento;
    private String Ocupacion;
    private int IdUsuario;
    private String LugarConsulta;
    private String PaisResidencia;
    private String CodigoPostal;
    private String telefono;
    private String Correo;
}
