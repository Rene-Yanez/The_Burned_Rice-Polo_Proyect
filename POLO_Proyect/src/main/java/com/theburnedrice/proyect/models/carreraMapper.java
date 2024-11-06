package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;
import java.util.List;
@Mapper
public interface carreraMapper {
carreraDTO carreraTocarreraDTO(carrera entidad);
    carrera carreraDTOTocarrera(carreraDTO dto);

    List<carreraDTO> carreraListTocarreraDTOList(List<carrera> entidadList);
    List<carrera> carreraDTOListTocarreraList(List<carreraDTO> dtoList);
}
