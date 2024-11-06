package com.theburnedrice.proyect.repository;

import com.theburnedrice.proyect.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
    
}