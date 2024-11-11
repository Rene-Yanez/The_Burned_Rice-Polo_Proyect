package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.the_burned_rice.proyecto_POLO.model.usuario;

@Repository
public interface usuarioDao extends JpaRepository<usuario, Integer>{

    
    usuario findfindByIdUsuario(@Param("id usuario")String id_usuario);
}
