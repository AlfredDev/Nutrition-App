package com.example.nutririonbackend.Service;

import com.example.nutririonbackend.InterfaceService.UsuarioInterfaz;
import com.example.nutririonbackend.Model.Usuario;
import com.example.nutririonbackend.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService implements UsuarioInterfaz {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
