package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.usuario_gestiona_noticia;

@Repository
public interface UsuarioNoticiaRepository extends JpaRepository<usuario_gestiona_noticia, Long>{

}
