package com.example.nutririonbackend.Controller;

import com.example.nutririonbackend.InterfaceService.UsuarioInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.nutririonbackend.Model.Usuario;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioController {
    @Autowired
    private UsuarioInterfaz usuario_service;

    @PostMapping("/add")
    public String add(@RequestBody  Usuario usuario){
        usuario_service.saveUsuario(usuario);
        return "Usuario agregado";
    }

    @GetMapping("/getAll")
    public List<Usuario> getAllUsuarios(){
        return  usuario_service.getAllUsuarios();
    }

}
