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
@Table(name ="centro")
public class centro implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_centro   ", nullable = false)
    private Integer id_centro;

    private String nombrecentro;

    private String descripcionCentro;
    
}
