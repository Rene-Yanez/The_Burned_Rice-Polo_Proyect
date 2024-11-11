package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.the_burned_rice.proyecto_POLO.model.proyecto;

@Repository
public interface proyectoDao extends JpaRepository<proyecto, Integer>{

    
    proyecto findfindById(@Param("id proyecto")String id_proyecto);
}
