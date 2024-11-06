package com.theburnedrice.proyect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
    
 @Entity
@Getter
@Setter
@Table(name="rol")
public class rol {
     
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_rol", nullable = false)
        private int id_rol;
        
        
        private String nombre_rol;
}
