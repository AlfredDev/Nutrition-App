package com.example.nutririonbackend.Service;

import com.example.nutririonbackend.InterfaceService.ConsultaInterface;
import com.example.nutririonbackend.Model.Consulta;
import com.example.nutririonbackend.Repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CosnultaService implements ConsultaInterface {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public List<Consulta> getAllConsultas() {
        return consultaRepository.findAll();
    }

    @Override
    public Consulta saveConsultas(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @Override
    public Optional<Consulta> findById(int id) {
        return Optional.empty();
    }
}
