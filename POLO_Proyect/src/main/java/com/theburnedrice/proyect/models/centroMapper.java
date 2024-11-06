package com.theburnedrice.proyect.models;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface centroMapper {
    centroDTO centroTocentroDTO(centro entidad);
    centro centroDTOTocarrera(centroDTO dto);

    List<centroDTO> centroListTocentroDTOList(List<centro> entidadList);
    List<centro> centroDTOListTocentroList(List<centroDTO> dtoList);
}
