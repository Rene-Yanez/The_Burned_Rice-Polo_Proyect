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
@Table(name="rol")
public class rol implements Serializable{
     
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_rol", nullable = false)
        private int id_rol;
        
        
        private String nombre_rol;
}
