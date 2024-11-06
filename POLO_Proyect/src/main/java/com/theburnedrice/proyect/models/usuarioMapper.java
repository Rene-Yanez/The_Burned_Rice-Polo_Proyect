package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface usuarioMapper {

        usuarioDTO usuarioTousuarioDTO(usuario entidad);
        usuario usuarioDTOTousuario(usuarioDTO dto);
    
        List<usuarioDTO> usuarioListTousuarioDTOList(List<usuario> entidadList);
        List<usuario> usuarioDTOListTousuarioList(List<usuarioDTO> dtoList);
    }

