package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.the_burned_rice.proyecto_POLO.model.usuario;

public interface usuarioDao extends JpaRepository<usuario, Integer>{

    usuario findfindByNombre(@Param("nombre usuario")String nombre_usuario);
}
