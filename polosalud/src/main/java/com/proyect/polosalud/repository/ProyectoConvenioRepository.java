package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.proyecto_tiene_convenio;

@Repository
public interface ProyectoConvenioRepository extends JpaRepository<proyecto_tiene_convenio, Long>{

}
