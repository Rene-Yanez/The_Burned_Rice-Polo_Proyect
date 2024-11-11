package com.the_burned_rice.proyecto_POLO.restImpl;

import java.util.Map;

import com.the_burned_rice.proyecto_POLO.contents.poloConstants;
import com.the_burned_rice.proyecto_POLO.rest.*;
import com.the_burned_rice.proyecto_POLO.service.usuarioService;
import com.the_burned_rice.proyecto_POLO.utils.poloUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class usuarioRestImpl implements usuarioRest{

    
    @Autowired
    usuarioService usuarioservice;

    @Override
    public ResponseEntity<String> signUp(@RequestBody(required = true) Map<String, String> requestMap){
        try {
            return usuarioservice.signUp(requestMap);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return poloUtils.getResponseEntity(poloConstants.ALGO_SALIO_TERRIBLE, HttpStatus.INTERNAL_SERVER_ERROR);
    } 
}
