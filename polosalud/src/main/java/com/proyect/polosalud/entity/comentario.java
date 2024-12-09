package com.proyect.polosalud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentario")
public class comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_comentario;

    @Column(nullable = false)
    private String contenido;
    
    @Column(nullable = false)
    private String fecha_comentario;
    
    public String getContenido() {
        return contenido;
    }

    public String getFecha_comentario() {
        return fecha_comentario;
    }

    public Long getId_comentario() {
        return id_comentario;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFecha_comentario(String fecha_comentario) {
        this.fecha_comentario = fecha_comentario;
    }

    public void setId_comentario(Long id_comentario) {
        this.id_comentario = id_comentario;
    }

}
