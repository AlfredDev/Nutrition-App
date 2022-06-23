/**
 * Creacion de la interfas de paciente
 *
 * @author (Jose Alfredo Garcia Cortes)
 * @version (2.0, FECHA 21 / 06 / 2022)
 */
package com.example.nutririonbackend.InterfaceService;

import com.example.nutririonbackend.Model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteInterfaz {
    //Parametros
    /*
    *Lista de pacientes
    */
    public List<Paciente> getAllPacientes();
    /*
     *Guardar pacientes
     */
    public Paciente savePaciente(Paciente paciente);
    /*
     *Buscar id en arreglo de pacientes
     */
    public Optional<Paciente> findById(int id);
    /*
     *Obtener id del objeto paciente
     */
    public Paciente getPacienteId(int id);

}
