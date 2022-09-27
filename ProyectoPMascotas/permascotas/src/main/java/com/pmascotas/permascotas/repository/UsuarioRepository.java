package com.pmascotas.permascotas.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pmascotas.permascotas.model.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    Optional<Usuario> findById(String idUsuario);

}
