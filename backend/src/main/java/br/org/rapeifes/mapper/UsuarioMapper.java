package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Usuario;
import br.org.rapeifes.dto.UsuarioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CampusMapper.class})
public interface UsuarioMapper extends GenericMapper<UsuarioDTO, Usuario> {

    @Override
    @Mapping(source = "campus.id", target = "campusId")
    @Mapping(source = "campus.nome", target = "campusNome")
    UsuarioDTO toDto(Usuario entity);

    @Override
    @Mapping(source = "campusId", target = "campus.id")
    @Mapping(source = "campusNome", target = "campus.nome")
    Usuario toEntity(UsuarioDTO dto);
}
