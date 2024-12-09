package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.carrera;

@Repository
public interface CarreraRepository extends JpaRepository<carrera, Long>{

}
