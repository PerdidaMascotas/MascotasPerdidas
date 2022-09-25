package com.pmascotas.permascotas.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Column(name = "id_usuario", unique = true, nullable = false) 
    private String idUsuario; // cc usuario
    @Column(name = "nombre", nullable = false)
    private String nombre;
    private String apellido;
    private Long celular;
    private String email;
    private String password;

    // Relación uno a muchos.
    @OneToMany(mappedBy = "usuario")
    private List<Mascota> mascotas;
    //private Set<Mascotas> mascotas = new HashSet<>();

    public Usuario () {
        // Constructor por defecto
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}