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
@Table(name="proyecto")
public class Proyecto implements Serializable{
 
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto", nullable = false)
    private int id_proyecto;
    
    
    private String nombre_proyecto;

 
    private String fecha_proyecto;
   
    private String descripcion_proyecto;

}
