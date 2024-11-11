package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.the_burned_rice.proyecto_POLO.model.centro;

@Repository
public interface centroDao extends JpaRepository<centro, Integer>{

    
    centro findfindById(@Param("id centro")String id_centro);
}
