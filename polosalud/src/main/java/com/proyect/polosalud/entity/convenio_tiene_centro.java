package com.proyect.polosalud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "convenioCentro")
public class convenio_tiene_centro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_convenio;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_centro;

    public Long getId_centro() {
        return id_centro;
    }

    public Long getId_convenio() {
        return id_convenio;
    }

    public void setId_centro(Long id_centro) {
        this.id_centro = id_centro;
    }

    public void setId_convenio(Long id_convenio) {
        this.id_convenio = id_convenio;
    }

}
