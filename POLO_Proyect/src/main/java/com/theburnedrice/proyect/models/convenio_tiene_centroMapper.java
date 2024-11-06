package com.theburnedrice.proyect.models;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface convenio_tiene_centroMapper {
    convenio_tiene_centroDTO convenio_tiene_centroToconvenio_tiene_centroDTO(convenio_tiene_centro entidad);
    convenio_tiene_centro convenio_tiene_centroDTOToconvenio_tiene_centro(convenio_tiene_centro dto);

    List<convenio_tiene_centroDTO> convenio_tiene_centroListToconvenio_tiene_centroDTOList(List<convenio_tiene_centro> entidadList);
    List<convenio_tiene_centro> convenio_tiene_centroDTOListToconvenio_tiene_centroList(List<convenio_tiene_centroDTO> dtoList);
}
