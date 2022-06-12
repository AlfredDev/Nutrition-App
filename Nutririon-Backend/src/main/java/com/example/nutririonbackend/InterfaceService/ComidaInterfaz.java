package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.example.nutririonbackend.Model.Comida;

public interface ComidaInterfaz {
    public List<Comida> getAllComida();
    public Comida saveComida(Comida comida);
    public Optional<Comida> findById(int id);
    public void deletedByid(int id);
}
