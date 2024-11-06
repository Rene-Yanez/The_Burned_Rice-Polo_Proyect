package com.theburnedrice.proyect.models;

import java.util.List;

public interface noticiaMapper {
carreraDTO carreraTocarreraDTO(carrera entidad);
    carrera carreraDTOTocarrera(carreraDTO dto);

    List<carreraDTO> carreraListTocarreraDTOList(List<carrera> entidadList);
    List<carrera> carreraDTOListTocarreraList(List<carreraDTO> dtoList);
}
