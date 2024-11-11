package com.the_burned_rice.proyecto_POLO.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name ="comentario")

public class comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario", nullable = false)
    private Integer id_comentario;

    private String contenido;
    
    private String fecha_comentario;
    

}
