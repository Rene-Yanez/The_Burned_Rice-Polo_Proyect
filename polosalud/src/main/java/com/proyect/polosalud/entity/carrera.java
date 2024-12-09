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

    
}
