package com.theburnedrice.proyect.models;

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
    @Column(name = "id_carrera", nullable = false)
    private Integer id_carrera;

    private String nombre_carrera;

    private String descripcion_carrera;
    
    private int codigo_carrera;

    
}
