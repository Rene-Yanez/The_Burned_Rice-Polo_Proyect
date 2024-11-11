package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.centro;

public interface centroDao extends JpaRepository<centro, Integer>{

    
    centro findfindById(@Param("id centro")String id_centro);
}
