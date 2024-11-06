package com.the_burned_rice.proyecto_POLO.serviceImpl;

import java.util.Map;

import com.the_burned_rice.proyecto_POLO.contents.poloConstants;
import com.the_burned_rice.proyecto_POLO.service.*;
import com.the_burned_rice.proyecto_POLO.utils.poloUtils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class usuarioServiceImpl{
    
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap){
        log.info("Dentro de Registrarse{}", requestMap);
        if (validateSignUpMap(requestMap)) {
            
        } else {
            return poloUtils.getResponseEntity(poloConstants.DATA_INVALIDA, HttpStatus.BAD_REQUEST);
        }
    }
    
    private boolean validateSignUpMap(Map<String,String> requestMap){
        if (requestMap.containsKey("nombre usuario") && requestMap.containsKey("apellido usuario") && requestMap.containsKey("nick") && requestMap.containsKey("email usuario") && requestMap.containsKey("contraseña usuario")) {
            return true;
        } else {
            return false;
        }
    }

}
