package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.the_burned_rice.proyecto_POLO.model.usuario_gestiona_proyecto;

@Repository
public interface usuario_gestiona_proyectoDao extends JpaRepository<usuario_gestiona_proyecto, Integer>{

    
    usuario_gestiona_proyecto findfindById(@Param("id usuario_gestiona_proyecto")String id_usuario_gestiona_proyecto);
}
