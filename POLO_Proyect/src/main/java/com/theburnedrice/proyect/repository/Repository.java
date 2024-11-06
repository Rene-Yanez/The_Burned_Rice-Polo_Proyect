package com.theburnedrice.proyect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.theburnedrice.proyect.models.Proyecto;

public interface Repository extends JpaRepository<Proyecto, Long> {
}