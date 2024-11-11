package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.proyecto_involucra_carrera;

public interface proyecto_involucra_carreraDao extends JpaRepository<proyecto_involucra_carrera, Integer>{

    
    proyecto_involucra_carrera findfindById(@Param("id proyecto_involucra_carrera")String id_proyecto_involucra_carrera);
}
