package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.convenio_tiene_centro;

public interface convenio_tiene_centroDao extends JpaRepository<convenio_tiene_centro, Integer>{

    
    convenio_tiene_centro findfindById(@Param("id convenio_tiene_centro")String id_convenio_tiene_centro);
}
