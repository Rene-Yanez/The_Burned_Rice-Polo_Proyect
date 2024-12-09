package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.convenio_tiene_centro;

@Repository
public interface ConvenioCentroRepository extends JpaRepository<convenio_tiene_centro, Long>{

}
