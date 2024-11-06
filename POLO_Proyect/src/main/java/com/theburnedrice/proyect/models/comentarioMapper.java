package com.theburnedrice.proyect.models;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface comentarioMapper {
    comentarioDTO comentarioTocomentarioDTO(comentario entidad);
    comentario comentarioDTOTocomentario(comentario dto);

    List<comentarioDTO> comentarioListTocomentarioDTOList(List<comentario> entidadList);
    List<comentario> comentarioDTOListTocomentarioList(List<comentarioDTO> dtoList);
}
