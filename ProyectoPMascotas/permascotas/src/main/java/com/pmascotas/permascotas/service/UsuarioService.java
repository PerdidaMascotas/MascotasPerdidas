package com.pmascotas.permascotas.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmascotas.permascotas.model.entity.Usuario;
import com.pmascotas.permascotas.repository.UsuarioRepository;

@Service
<<<<<<< HEAD
public class UsuarioService{
=======
public class UsuarioService {
>>>>>>> 93fda8ce6310015dcc6d95399054419aefaea6a8
    @Autowired
    UsuarioRepository usuarioRepository;
 
    // Guardar un usuario
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Consultar un usuario
    public Optional<Usuario> consultarUsuarioPorId(Long idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }


    public Usuario findByUserPassword(Long idUsuario, String password) {
        Usuario usuario = usuarioRepository.findByUserPassword(idUsuario, password);
        if( usuario == null) {
            return new Usuario(0L, "","");
        }
        return  usuario;
    }

    // Obtener una lista de usuarios
    public List<Usuario> obtenerUsuarios() {
        return  (List<Usuario>) usuarioRepository.findAll();
    }

    // Elimiar usuario
    public boolean eliminarUsuario(Long idUsuario) {
        try {
            usuarioRepository.deleteById(idUsuario);
            return true;
        } catch(Exception err) {
            return false;
        }
    }
}
