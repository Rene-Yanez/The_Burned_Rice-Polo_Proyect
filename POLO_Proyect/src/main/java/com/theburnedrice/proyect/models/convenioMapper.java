package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface convenioMapper {
    convenioDTO convenioTonconvenioDTO(convenio entidad);
    convenio convenioDTOToconvenio(convenioDTO dto);

    List<convenioDTO> convenioListToconvenioDTOList(List<convenio> entidadList);
    List<convenio> convenioDTOListToconvenioList(List<convenioDTO> dtoList);
}
