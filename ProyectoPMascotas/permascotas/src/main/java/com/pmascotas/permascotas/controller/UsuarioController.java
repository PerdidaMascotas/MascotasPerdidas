package com.pmascotas.permascotas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmascotas.permascotas.model.entity.Usuario;
import com.pmascotas.permascotas.service.UsuarioSevice;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    UsuarioSevice usuarioSevice;

    @GetMapping()
    public ArrayList<Usuario> obtenerUsuarios() {
         return usuarioSevice.obtenerUsuarios();
    }

    @PostMapping()
    public Usuario guardarUsuarios(@RequestBody Usuario usuario) {
        return usuarioSevice.guardarUsuario(usuario);
    }
    
}
