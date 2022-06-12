package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.nutririonbackend.Model.ComposicionCorporal;

public interface ComposicioncoporalInterfaz {
    public List<ComposicionCorporal> getAllComposicionCorporal();
    public ComposicionCorporal saveComposicionCorporal(ComposicionCorporal composicionCorporal);
    public Optional<ComposicionCorporal> findById(int id);
    public void deletedByid(int id);
}
