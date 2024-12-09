package com.proyect.polosalud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "noticia")
public class noticia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_noticia;

    @Column(nullable = false)
    private String titulo;
    
    @Column(nullable = true)
    private String categoria;
    
    @Column(nullable = false)
    private String fechapublicacion;

    @Column(nullable = false)
    private String contenido;
    
    public String getCategoria() {
        return categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public Long getId_noticia() {
        return id_noticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public void setId_noticia(Long id_noticia) {
        this.id_noticia = id_noticia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
