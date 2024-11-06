package com.theburnedrice.proyect.models;
import java.util.ArrayList;
import java.util.List;

public class centroDTO {

    private Integer id_centro;

    private String nombrecentro;

    private String descripcionCentro;

    public Integer getId_centro() {
        return id_centro;
    }

    public void setId_centro(Integer id_centro) {
        this.id_centro = id_centro;
    }

    public String getNombrecentro() {
        return nombrecentro;
    }

    public void setNombrecentro(String nombrecentro) {
        this.nombrecentro = nombrecentro;
    }

    public String getDescripcionCentro() {
        return descripcionCentro;
    }

    public void setDescripcionCentro(String descripcionCentro) {
        this.descripcionCentro = descripcionCentro;
    }
    
}
