package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.comentario;

public interface comentarioDao extends JpaRepository<comentario, Integer>{

    
    comentario findfindById(@Param("id comentario")String id_comentario);
}
