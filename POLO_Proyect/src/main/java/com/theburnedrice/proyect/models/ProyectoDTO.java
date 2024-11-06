package com.theburnedrice.proyect.models;
import java.util.ArrayList;
import java.util.List;
public class proyectoDTO {
    private int id_proyecto;
    
    
    private String nombre_proyecto;

 
    private String fecha_proyecto;
   
    private String descripcion_proyecto;

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getFecha_proyecto() {
        return fecha_proyecto;
    }

    public void setFecha_proyecto(String fecha_proyecto) {
        this.fecha_proyecto = fecha_proyecto;
    }

    public String getDescripcion_proyecto() {
        return descripcion_proyecto;
    }

    public void setDescripcion_proyecto(String descripcion_proyecto) {
        this.descripcion_proyecto = descripcion_proyecto;
    }
    
}
