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
@Table(name ="comentario")

public class comentario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario", nullable = false)
    private Integer id_comentario;

    private String contenido;
    
    private String fecha_comentario;
    

}
