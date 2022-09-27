package com.pmascotas.permascotas.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmascotas.permascotas.model.entity.Usuario;
import com.pmascotas.permascotas.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
 
    // Guardar un usuario
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Consultar un usuario
    public Optional<Usuario> consultarUsuarioPorId(String idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

    // Obtener una lista de usuarios
    public ArrayList<Usuario> obtenerUsuarios() {
    return  (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    // Elimiar usuario
    public boolean eliminarUsuario(String idUsuario) {
        try {
            usuarioRepository.deleteById(idUsuario);
            return true;
        } catch(Exception err) {
            return false;
        }
    }
}
