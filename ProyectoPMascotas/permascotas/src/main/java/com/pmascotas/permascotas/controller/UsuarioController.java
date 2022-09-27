package com.pmascotas.permascotas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmascotas.permascotas.model.entity.Usuario;
import com.pmascotas.permascotas.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    // Crear usuario
    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    // Consultar usuario
    @GetMapping( path = "/{idUsuario}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("idUsuario") String idUsuario) {
        return this.usuarioService.consultarUsuarioPorId(idUsuario);
    }

    // Eliminar un usuario
    @DeleteMapping( path = "/{idUsuario}")
    public String eliminarUsuarioPorId(@PathVariable("idUsuario") String idUsuario){
        boolean ok = this.usuarioService.eliminarUsuario(idUsuario);
        if (ok){
            return "Se eliminó el usuario con id" + idUsuario;
        }else{
            return "No pudo eliminar el usuario con id" + idUsuario;
        }
    }
}
