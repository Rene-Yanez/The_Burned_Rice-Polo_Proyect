package com.theburnedrice.proyect.models;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface proyecto_tiene_convenioMapper {
 proyecto_tiene_convenioDTO proyecto_tiene_convenioToproyecto_tiene_convenioDTO(proyecto_tiene_convenio entidad);
 proyecto_tiene_convenio proyecto_tiene_convenioDTOToproyecto_tiene_convenio(proyecto_tiene_convenioDTO dto);

    List<proyecto_tiene_convenioDTO> proyecto_tiene_convenioListToproyecto_tiene_convenioDTOList(List<proyecto_tiene_convenio> entidadList);
    List<proyecto_tiene_convenio> proyecto_tiene_convenioDTOListToproyecto_tiene_convenioList(List<proyecto_tiene_convenioDTO> dtoList);

}
