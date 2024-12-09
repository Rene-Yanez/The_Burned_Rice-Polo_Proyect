package com.proyect.polosalud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PostHtmlController {

  @RequestMapping("/index.html")
  public String home(){
    return "index";
  }

  @RequestMapping("/pilares.html")
  public String pilares(){

    return "pilares";
  }

  @RequestMapping("/noticias.html")
  public String noticias(){

    return "noticias";
  }

  @RequestMapping("/centros.html")
  public String centros(){

    return "centros";
  }

  @RequestMapping("/proyectos.html")
  public String proyectos(){

    return "proyectos";
  }

  @RequestMapping("/carreras.html")
  public String carreras(){

    return "carreras";
  }





}
