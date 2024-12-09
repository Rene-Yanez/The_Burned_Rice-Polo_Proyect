package com.proyect.polosalud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarioNoticia")
public class usuario_gestiona_noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_noticia;

    public Long getId_usuario() {
        return id_usuario;
    }

    public Long getId_noticia() {
        return id_noticia;
    }

    public void setId_noticia(Long id_noticia) {
        this.id_noticia = id_noticia;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

}
