package com.pmascotas.permascotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name ="mascotas")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota", unique = true, nullable = false)
    private String idMascota;
    @Column(name = "id_usuario", unique = true, nullable = false)
    private String idUsuario;
    @Column(name = "nombre_mascota")
    private String nombreMascota;
    @Column(name = "tipo_mascota")
    private char tipoMascota;
    @Column(name = "especie")
    private String especie;
    @Column(name = "raza")
    private String raza;
    @Column(name = "tamanio")
    private String tamanio;
    @Column(name = "sexo")
    private char sexo;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "color")
    private String color;
    @Column(name = "chip")
    private boolean chip;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "fecha_registro")
    private Integer fechaRegistro;
    @Column(name = "imagen_url")
    private char imangenUrl;
    @Column(name = "estado")
    private char estado;

    // Relación de muchos a uno.
    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    public Mascota() {
        // Constructor por defecto
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public char getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(char tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Integer fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public char getImangenUrl() {
        return imangenUrl;
    }

    public void setImangenUrl(char imangenUrl) {
        this.imangenUrl = imangenUrl;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}