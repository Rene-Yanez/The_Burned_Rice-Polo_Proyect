package com.the_burned_rice.proyecto_POLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.the_burned_rice.proyecto_POLO.model.noticia;

@Repository
public interface noticiaDao extends JpaRepository<noticia, Integer>{

    
    noticia findfindById(@Param("id noticia")String id_noticia);
}
