package com.pmascotas.permascotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pmascotas.permascotas.model.entity.Mascota;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota, Long> {
    @Query(value="select * from mascotas c, usuarios u where c.id_usuario = u.id_usuario and c.id_usuario = ?1", nativeQuery = true)
	List<Mascota> findByUserId(Long idUsuario);
}
