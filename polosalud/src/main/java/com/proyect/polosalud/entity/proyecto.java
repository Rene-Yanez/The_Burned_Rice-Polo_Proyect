package com.proyect.polosalud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyecto")
public class proyecto {
 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proyecto;
    
    @Column(nullable = false)
    private String nombre_proyecto;

    @Column(nullable = false)
    private String fecha_proyecto;
   
    @Column(nullable = false)
    private String descripcion_proyecto;

    public String getDescripcion_proyecto() {
        return descripcion_proyecto;
    }

    public String getFecha_proyecto() {
        return fecha_proyecto;
    }

    public Long getId_proyecto() {
        return id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setDescripcion_proyecto(String descripcion_proyecto) {
        this.descripcion_proyecto = descripcion_proyecto;
    }

    public void setFecha_proyecto(String fecha_proyecto) {
        this.fecha_proyecto = fecha_proyecto;
    }

    public void setId_proyecto(Long id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

}
