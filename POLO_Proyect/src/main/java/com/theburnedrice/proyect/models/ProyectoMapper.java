package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;


import java.util.List;
@Mapper
public interface proyectoMapper {
proyectoDTO proyectoToProyectoDTO(proyecto entidad);
    proyecto proyectoDTOToProyecto(proyectoDTO dto);

    List<proyectoDTO> proyectoListToProyectoDTOList(List<proyecto> entidadList);
    List<proyecto> proyectoDTOListToProyectoList(List<proyectoDTO> dtoList);
}
