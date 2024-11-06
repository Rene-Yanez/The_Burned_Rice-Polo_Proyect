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
@Table(name ="noticia")
public class noticia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_noticia", nullable = false)
    private Integer id_noticia;

    private String titulo;
    
    private String categoria;
    
    private String fechapublicacion;

    private String contenido;
    

}
