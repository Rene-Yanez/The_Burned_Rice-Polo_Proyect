package com.theburnedrice.proyect.models;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper

public interface usuario_gestiona_proyectoMapper {
    usuario_gestiona_proyectoDTO usuario_gestiona_proyectoTousuario_gestiona_proyectoDTO(usuario_gestiona_proyecto entidad);
    usuario_gestiona_proyecto usuario_gestiona_proyectoDTOTousuario_gestiona_proyecto(usuario_gestiona_proyectoDTO dto);
    
        List<usuario_gestiona_proyectoDTO> usuarioListTousuarioDTOList(List<usuario_gestiona_proyecto> entidadList);
        List<usuario_gestiona_proyecto> usuario_gestiona_proyectoDTOListTousuario_gestiona_proyectoList(List<usuario_gestiona_proyectoDTO> dtoList);
}
