package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface rolMapper {
    rolDTO rolTorolDTO(rol entidad);
    rol rolDTOTorol(rolDTO dto);

    List<rolDTO> rolListTorolDTOList(List<rol> entidadList);
    List<rol> rolDTOListTorolList(List<rolDTO> dtoList);
}
