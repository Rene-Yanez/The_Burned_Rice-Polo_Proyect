package com.theburnedrice.proyect.models;
import java.util.ArrayList;
import java.util.List;

public class convenioDTO {
    private Integer id_convenio;

    private String nombre_convenio;

    private String descripcion_convenio;
    private String fecha_convenio;
    private String datos;
    
    public Integer getId_convenio() {
        return id_convenio;
    }
    public void setId_convenio(Integer id_convenio) {
        this.id_convenio = id_convenio;
    }
    public String getNombre_convenio() {
        return nombre_convenio;
    }
    public void setNombre_convenio(String nombre_convenio) {
        this.nombre_convenio = nombre_convenio;
    }
    public String getDescripcion_convenio() {
        return descripcion_convenio;
    }
    public void setDescripcion_convenio(String descripcion_convenio) {
        this.descripcion_convenio = descripcion_convenio;
    }
    public String getFecha_convenio() {
        return fecha_convenio;
    }
    public void setFecha_convenio(String fecha_convenio) {
        this.fecha_convenio = fecha_convenio;
    }
    public String getDatos() {
        return datos;
    }
    public void setDatos(String datos) {
        this.datos = datos;
    }
    
}
