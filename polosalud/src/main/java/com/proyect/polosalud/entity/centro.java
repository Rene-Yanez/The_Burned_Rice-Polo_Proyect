package com.proyect.polosalud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "centro")
public class centro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_centro   ", nullable = false)
    private Long id_centro;

    @Column(nullable = false)
    private String nombrecentro;

    @Column(nullable = false)
    private String descripcionCentro;
    
    public String getDescripcionCentro() {
        return descripcionCentro;
    }

    public Long getId_centro() {
        return id_centro;
    }

    public String getNombrecentro() {
        return nombrecentro;
    }

    public void setDescripcionCentro(String descripcionCentro) {
        this.descripcionCentro = descripcionCentro;
    }

    public void setId_centro(Long id_centro) {
        this.id_centro = id_centro;
    }
    
    public void setNombrecentro(String nombrecentro) {
        this.nombrecentro = nombrecentro;
    }
}
