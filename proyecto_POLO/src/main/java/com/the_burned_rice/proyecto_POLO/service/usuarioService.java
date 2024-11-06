package com.the_burned_rice.proyecto_POLO.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public class usuarioService {

    ResponseEntity<String> signUp(Map<String, String> requestMap);
}
