package com.theburnedrice.proyect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name ="carrera")

public class carrera {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera", nullable = false)
    private Integer id_carrera;

    private String nombre_carrera;

    private String descripcion_carrera;
    
    private int codigo_carrera;

    
}
