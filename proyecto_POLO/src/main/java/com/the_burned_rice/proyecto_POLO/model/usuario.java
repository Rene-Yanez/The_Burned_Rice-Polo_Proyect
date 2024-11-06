package com.the_burned_rice.proyecto_POLO.model;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.*;
import lombok.Data;

@NamedQuery(name = "usuario.findByNombre",query = "Selecciona el nombre del usuario=:nombre_usuario")


@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name= "usuario")
public class usuario implements Serializable{

    private static final long serialVersionUID = 1L;
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer id_usuario;
    
    @Column(name = "nombre usuario")
    private String nombre_usuario;
    
    @Column(name = "apellido usuario")
    private String apellidos_usuario;
    
    @Column(name = "nick")
    private String nick_usuario;

    
    @Column(name = "email usuario")
    private String email;
    
    @Column(name = "contraseña usuario")
    private String password;


    
}
