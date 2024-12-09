package com.proyect.polosalud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.polosalud.entity.centro;

@Repository
public interface CentroRepository extends JpaRepository<centro, Long>{

}
