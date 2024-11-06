package com.theburnedrice.proyect.models;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface usuario_gestiona_noticiaMapper {
 usuario_gestiona_noticiaDTO usuario_gestiona_noticiaTousuario_gestiona_noticiaDTO(usuario_gestiona_noticia entidad);
 usuario_gestiona_noticia usuario_gestiona_noticiaDTOTousuario_gestiona_noticia(usuario_gestiona_noticia dto);

    List<usuario_gestiona_noticiaDTO> usuario_gestiona_noticiaListTorolDTOList(List<usuario_gestiona_noticia> entidadList);
    List<usuario_gestiona_noticia> usuario_gestiona_noticiaDTOListTorolList(List<usuario_gestiona_noticiaDTO> dtoList);
}
