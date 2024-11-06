package com.theburnedrice.proyect.models;
import java.util.ArrayList;
import java.util.List;

public class comentarioDTO {
    private Integer id_comentario;

    private String contenido;
    
    private String fecha_comentario;

    public Integer getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Integer id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha_comentario() {
        return fecha_comentario;
    }

    public void setFecha_comentario(String fecha_comentario) {
        this.fecha_comentario = fecha_comentario;
    }
    
}
