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
@Table(name= "usuario")
public class usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer id_usuario;
    
    private String nombre_usuario;

    private String apellidos_usuario;
    
    private String nick_usuario;

    private String email;
    
    
    private String password;


    
}
