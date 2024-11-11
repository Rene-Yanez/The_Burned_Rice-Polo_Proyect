package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.the_burned_rice.proyecto_POLO.model.usuario_gestiona_noticia;

@Repository
public interface usuario_gestiona_noticiaDao extends JpaRepository<usuario_gestiona_noticia, Integer>{

    
    usuario_gestiona_noticia findfindById(@Param("id usuario_gestiona_noticia")String id_usuario_gestiona_noticia);
}

