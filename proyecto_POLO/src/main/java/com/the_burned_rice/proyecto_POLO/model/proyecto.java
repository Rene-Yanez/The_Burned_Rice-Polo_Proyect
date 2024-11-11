package com.the_burned_rice.proyecto_POLO.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="proyecto")
public class proyecto {
 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto", nullable = false)
    private int id_proyecto;
    
    
    private String nombre_proyecto;

 
    private String fecha_proyecto;
   
    private String descripcion_proyecto;

}
