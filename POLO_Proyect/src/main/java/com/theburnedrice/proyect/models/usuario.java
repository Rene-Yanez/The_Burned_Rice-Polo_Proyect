package com.theburnedrice.proyect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario; 
    
    @Column(name = "nombre_usuario", nullable = false)
    private String nombreUsuario;

    @Column(name = "apellidos_usuario", nullable = false)
    private String apellidosUsuario;
    
    @Column(name = "nick_usuario", nullable = false, unique = true)
    private String nickUsuario;

    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String password;
}
