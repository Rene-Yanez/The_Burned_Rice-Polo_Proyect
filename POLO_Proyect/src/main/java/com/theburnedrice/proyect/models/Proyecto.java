package com.theburnedrice.proyect.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="proyecto")
public class Proyecto {
 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto", nullable = false)
    private int id_proyecto;
    
    
    private String nombre_proyecto;

 
    private String fecha_proyecto;
   
    private String descripcion_proyecto;

}
