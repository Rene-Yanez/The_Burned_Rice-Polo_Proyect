package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<comentario, Long>{

}
