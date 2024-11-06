package com.theburnedrice.proyect.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.theburnedrice.proyect.models.usuario;

public interface Repository extends JpaRepository<usuario, Long> {

}

