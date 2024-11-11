package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.rol;

public interface rolDao extends JpaRepository<rol, Integer>{

    
    rol findfindById(@Param("id rol")String id_rol);
}
