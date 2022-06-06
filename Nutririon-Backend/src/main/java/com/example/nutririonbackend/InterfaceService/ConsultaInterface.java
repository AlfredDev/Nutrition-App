package com.example.nutririonbackend.InterfaceService;

import com.example.nutririonbackend.Model.Consulta;

import java.util.List;
import java.util.Optional;

public interface ConsultaInterface {

    public List<Consulta> getAllConsultas();
    public Consulta saveConsultas(Consulta consulta);
    public Optional<Consulta> findById(int id);

}
