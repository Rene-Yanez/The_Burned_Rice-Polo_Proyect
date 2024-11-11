package com.the_burned_rice.proyecto_POLO.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="centro")
public class centro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_centro   ", nullable = false)
    private Integer id_centro;

    private String nombrecentro;

    private String descripcionCentro;
    
}
