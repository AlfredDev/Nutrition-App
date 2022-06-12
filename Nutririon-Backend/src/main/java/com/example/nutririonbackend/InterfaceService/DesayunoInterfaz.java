package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.example.nutririonbackend.Model.Desayuno;

public interface DesayunoInterfaz {
    public List<Desayuno> getAllDesayuno();
    public Desayuno saveDesayuno(Desayuno desayuno);
    public Optional<Desayuno> findById(int id);
    public void deletedByid(int id);
}
