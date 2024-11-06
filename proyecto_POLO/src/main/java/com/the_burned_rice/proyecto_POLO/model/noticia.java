package com.theburnedrice.proyect.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name ="noticia")
public class noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_noticia", nullable = false)
    private Integer id_noticia;

    private String titulo;
    
    private String categoria;
    
    private String fechapublicacion;

    private String contenido;
    

}
