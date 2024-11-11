package com.the_burned_rice.proyecto_POLO.model;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name ="carrera")

public class carrera implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id carrera", nullable = false)
    private Integer id_carrera;

    @Column(name = "nombre carrera")
    private String nombre_carrera;

    @Column(name = "descripcion carrera")
    private String descripcion_carrera;
    
    @Column(name = "codigo carrera")
    private int codigo_carrera;

    
}
