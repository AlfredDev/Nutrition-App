package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.Consulta;

public interface ConsultaInterfaz {
    public List<Consulta> getAllConsulta();
    public Consulta saveConsulta(Consulta consulta);
    public Optional<Consulta> findById(int id);
    public void deletedByid(int id);
}
