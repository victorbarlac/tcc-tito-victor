package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Curso;
import br.org.rapeifes.dto.CursoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CampusResumoMapper.class})
public interface CursoMapper extends GenericMapper<CursoDTO, Curso> {
    @Override
    CursoDTO toDto(Curso entity);

    @Override
    Curso toEntity(CursoDTO dto);
}
