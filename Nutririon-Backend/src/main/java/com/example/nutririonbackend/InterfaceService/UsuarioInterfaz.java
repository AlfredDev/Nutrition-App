package com.example.nutririonbackend.InterfaceService;

import com.example.nutririonbackend.Model.Usuario;

import java.util.List;

public interface UsuarioInterfaz {

    public List<Usuario> getAllUsuarios();
    public  Usuario saveUsuario(Usuario usuario);
}
