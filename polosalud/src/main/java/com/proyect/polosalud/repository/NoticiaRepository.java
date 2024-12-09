package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.noticia;

@Repository
public interface NoticiaRepository extends JpaRepository<noticia, Long>{

}
