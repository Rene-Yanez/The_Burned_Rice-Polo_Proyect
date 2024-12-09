package com.proyect.polosalud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrera")
public class carrera{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carrera;

    @Column(nullable = false)
    private String nombre_carrera;

    @Column(nullable = false)
    private String descripcion_carrera;
    
    @Column(nullable = false, unique = true)
    private Long codigo_carrera;

    public Long getCodigo_carrera() {
        return codigo_carrera;
    }

    public String getDescripcion_carrera() {
        return descripcion_carrera;
    }

    public Long getId_carrera() {
        return id_carrera;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setCodigo_carrera(Long codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public void setDescripcion_carrera(String descripcion_carrera) {
        this.descripcion_carrera = descripcion_carrera;
    }

    public void setId_carrera(Long id_carrera) {
        this.id_carrera = id_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }
    
}
