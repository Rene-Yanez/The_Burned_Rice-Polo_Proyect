package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.proyecto;

public interface proyectoDao extends JpaRepository<proyecto, Integer>{

    
    proyecto findfindById(@Param("id proyecto")String id_proyecto);
}
