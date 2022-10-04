package com.pmascotas.permascotas.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pmascotas.permascotas.model.entity.Mascota;
import com.pmascotas.permascotas.repository.MascotaRepository;

@Service
public class MascotaService {
    @Autowired
    MascotaRepository mascotaRepository;

    // Guardar mascota.
    public Mascota guardarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    // Consultar mascota por id.
    public Optional<Mascota> obtenerMascotaPorId(Long idMascota) {

        return mascotaRepository.findById(idMascota);
    }

    // 
   public List<Mascota> getPetsByUser(Long idUsuario) {
        List<Mascota> mascotas = mascotaRepository.findByUserId(idUsuario);
        System.out.println("consultando mascotas......................");
        if(mascotas == null) {
            System.out.println("mascota null");
            return null;
        }
        System.out.println("CANT. MASCOTAS: "+mascotas.size());
        return mascotas;
    }

    // Consular todas las mascotas.
    public List<Mascota> consultarMascotas() {
        return  (List<Mascota>) mascotaRepository.findAll();
    }
    // Update
    /*public void actualizarMascota(Long idMascota) {
         mascotaRepository.updateById(idMascota);
    }*/

    // Eliminara una mascota.
    public void eliminarMascota(Long idMascota) {
        mascotaRepository.deleteById(idMascota);
    }
}
