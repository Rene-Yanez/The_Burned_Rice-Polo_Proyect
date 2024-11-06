package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;


import java.util.List;
@Mapper
public interface ProyectoMapper {
ProyectoDTO proyectoToProyectoDTO(Proyecto entidad);
    Proyecto proyectoDTOToProyecto(ProyectoDTO dto);

    List<ProyectoDTO> proyectoListToProyectoDTOList(List<Proyecto> entidadList);
    List<Proyecto> proyectoDTOListToProyectoList(List<ProyectoDTO> dtoList);
}
