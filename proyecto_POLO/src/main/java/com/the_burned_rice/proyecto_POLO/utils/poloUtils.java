package com.the_burned_rice.proyecto_POLO.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class poloUtils {

    private poloUtils(){
        

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<>("{\"message\":\""+ responseMessage + "\"}", httpStatus);

    }
}
