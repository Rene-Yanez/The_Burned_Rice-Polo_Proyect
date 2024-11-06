package com.theburnedrice.proyect.models;
import java.util.ArrayList;
import java.util.List;

public class noticiaDTO {
    private Integer id_noticia;

    private String titulo;
    
    private String categoria;
    
    private String fechapublicacion;

    private String contenido;

    public Integer getId_noticia() {
        return id_noticia;
    }

    public void setId_noticia(Integer id_noticia) {
        this.id_noticia = id_noticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
