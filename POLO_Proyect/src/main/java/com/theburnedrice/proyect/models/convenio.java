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
@Table(name ="convenio") 
public class convenio implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_convenio", nullable = false)
    private Integer id_convenio;

    private String nombre_convenio;

    private String descripcion_convenio;
    private String fecha_convenio;
    private String datos;


}
