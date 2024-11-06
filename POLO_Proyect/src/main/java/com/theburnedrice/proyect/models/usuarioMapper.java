package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface usuarioMapper {

        usuarioDTO usuarioTousuarioDTO(Usuario entidad);
        Usuario usuarioDTOTousuario(usuarioDTO dto);
    
        List<usuarioDTO> usuarioListTousuarioDTOList(List<Usuario> entidadList);
        List<Usuario> usuarioDTOListTousuarioList(List<usuarioDTO> dtoList);
    }

