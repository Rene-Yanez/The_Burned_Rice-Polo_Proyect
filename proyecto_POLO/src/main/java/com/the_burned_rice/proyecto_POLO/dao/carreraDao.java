package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.the_burned_rice.proyecto_POLO.model.carrera;

@Repository
public interface carreraDao extends JpaRepository<carrera, Integer>{

    
    carrera findfindById(@Param("id carrera")String id_carrera);
}
