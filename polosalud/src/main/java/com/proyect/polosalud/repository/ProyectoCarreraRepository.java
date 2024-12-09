package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.proyecto_involucra_carrera;

@Repository
public interface ProyectoCarreraRepository extends JpaRepository<proyecto_involucra_carrera, Long>{

}
