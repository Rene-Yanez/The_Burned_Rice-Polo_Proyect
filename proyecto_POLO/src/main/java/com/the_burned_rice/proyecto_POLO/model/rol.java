package com.the_burned_rice.proyecto_POLO.model;

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
