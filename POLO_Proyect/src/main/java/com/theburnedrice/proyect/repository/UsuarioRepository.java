package com.theburnedrice.proyect.repository;

import com.theburnedrice.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<usuario, Integer> {
    usuario getBynombre_usuario(String nombre_usuario);
}
