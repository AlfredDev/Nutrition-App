package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.ConsultaInterfaz;
import com.example.nutririonbackend.Model.Consulta;
import com.example.nutririonbackend.Repository.CosultaRepository;

@Service
public class ConsultaService implements ConsultaInterfaz{
    @Autowired
    private CosultaRepository consulta;

    @Override
    public List<Consulta> getAllConsulta() {
        return consulta.findAll();
    }

    @Override
    public Consulta saveConsulta(Consulta consult) {
        return consulta.save(consult);
    }

    @Override
    public Optional<Consulta> findById(int id) {
        return consulta.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        consulta.deleteById(id);
    }

}
