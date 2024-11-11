package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.carrera;

public interface carreraDao extends JpaRepository<carrera, Integer>{

    
    carrera findfindById(@Param("id carrera")String id_carrera);
}
