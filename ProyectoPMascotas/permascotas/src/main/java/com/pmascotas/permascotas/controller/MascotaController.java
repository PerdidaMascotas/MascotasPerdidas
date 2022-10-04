package com.pmascotas.permascotas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pmascotas.permascotas.model.entity.Mascota;
import com.pmascotas.permascotas.service.MascotaService;

@Controller
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @GetMapping({ "/mascotas" })
    public String misMascotas(Model model) {
        List<Mascota> mascotas = mascotaService.consultarMascotas();
        model.addAttribute("allPets", mascotas);
        return "mis_mascotas";
    }
    
}
