package com.theburnedrice.proyect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "usuario")
public class usuario {

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
