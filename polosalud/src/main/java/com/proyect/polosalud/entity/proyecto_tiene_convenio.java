package com.proyect.polosalud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyectoConvenio")
public class proyecto_tiene_convenio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proyecto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_convenio;

    public Long getId_convenio() {
        return id_convenio;
    }

    public Long getId_proyecto() {
        return id_proyecto;
    }

    public void setId_convenio(Long id_convenio) {
        this.id_convenio = id_convenio;
    }

    public void setId_proyecto(Long id_proyecto) {
        this.id_proyecto = id_proyecto;
    }


}
