package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface noticiaMapper {
    noticiaDTO noticiaTonoticiaDTO(noticia entidad);
    noticia noticiaDTOTonoticia(noticiaDTO dto);

    List<noticiaDTO> noticiaListTonoticiaDTOList(List<noticia> entidadList);
    List<noticia> noticiaDTOListTonoticiaList(List<noticiaDTO> dtoList);
}
