package com.the_burned_rice.proyecto_POLO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.the_burned_rice.proyecto_POLO.dao.usuarioDao;
import com.the_burned_rice.proyecto_POLO.model.usuario;

@Service
public class usuarioService {

    @Autowired
    usuarioDao usuarioDao;

    public List<usuario> getUsuarios(){
        return (List<usuario>) usuarioDao.findAll(); 
    }

    public usuario getUsuarioById(String id){
        return (usuario) usuarioDao.findfindByIdUsuario(id);
    }
}
