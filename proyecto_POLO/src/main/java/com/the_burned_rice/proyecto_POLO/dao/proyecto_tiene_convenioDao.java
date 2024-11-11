package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.proyecto_tiene_convenio;

public interface proyecto_tiene_convenioDao extends JpaRepository<proyecto_tiene_convenio, Integer>{

    
    proyecto_tiene_convenio findfindById(@Param("id proyecto_tiene_convenio")String id_proyecto_tiene_convenio);
}
