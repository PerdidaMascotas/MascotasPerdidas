package com.pmascotas.permascotas.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.pmascotas.permascotas.model.entity.Mascota;
import com.pmascotas.permascotas.model.entity.Usuario;
<<<<<<< HEAD
import com.pmascotas.permascotas.service.MascotaService;
=======
>>>>>>> 93fda8ce6310015dcc6d95399054419aefaea6a8
import com.pmascotas.permascotas.service.UsuarioService;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
<<<<<<< HEAD
    @Autowired
    MascotaService mascotaService;

    @GetMapping({ "/", "HOME", "index" })
    public String home(Model model) {
        List<Mascota> mascotas = mascotaService.consultarMascotas();
        model.addAttribute("allPets", mascotas);
        return "home";
    }

    @GetMapping("/irSesion")
    public String oauth(Model model) {
        model.addAttribute("usuarioLogueado", new Usuario());
        return "inicio_sesion";
    }


    @PostMapping("/iniciarSesion")
    public String iniciarSesion(@ModelAttribute("usuarioLogueado") Usuario user, Model model) {
        System.out.println("idUsuario:........: "+user.getIdUsuario());
        Usuario usuario = usuarioService.findByUserPassword(user.getIdUsuario(), user.getPassword());
        
        if (usuario.getIdUsuario() != null) {
            model.addAttribute("idUsuario", usuario.getIdUsuario());
            model.addAttribute("email", usuario.getEmail());
            model.addAttribute("password", usuario.getPassword());
            System.out.println("ID_USUARIO:........"+usuario.getIdUsuario());
            model.addAttribute("misMascotas", mascotaService.getPetsByUser(usuario.getIdUsuario()));
            return "mis_mascotas";
        } else {
            return "credenciales_incorrectas";
=======

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
>>>>>>> 93fda8ce6310015dcc6d95399054419aefaea6a8
        }
    }
}