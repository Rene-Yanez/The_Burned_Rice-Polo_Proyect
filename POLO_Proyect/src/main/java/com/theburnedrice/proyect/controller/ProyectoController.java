package com.theburnedrice.proyect.controller;

import com.theburnedrice.proyect.models.Proyecto;
import com.theburnedrice.proyect.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @GetMapping("/listar")
    public List<Proyecto> listarProyectos() {
        return proyectoService.listarProyectos();
    }
}