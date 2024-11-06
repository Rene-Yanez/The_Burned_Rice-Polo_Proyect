package com.theburnedrice.proyect.models;
import java.util.ArrayList;
import java.util.List;
public class carreraDTO {
    private Integer id_carrera;

    private String nombre_carrera;

    private String descripcion_carrera;
    
    private int codigo_carrera;

    public Integer getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(Integer id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getDescripcion_carrera() {
        return descripcion_carrera;
    }

    public void setDescripcion_carrera(String descripcion_carrera) {
        this.descripcion_carrera = descripcion_carrera;
    }

    public int getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    
}
