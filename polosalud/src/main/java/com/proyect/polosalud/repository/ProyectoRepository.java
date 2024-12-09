package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<proyecto, Long>{

}
