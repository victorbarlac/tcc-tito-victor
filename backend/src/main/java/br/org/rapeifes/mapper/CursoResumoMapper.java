package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Curso;
import br.org.rapeifes.dto.CursoResumoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CursoResumoMapper extends GenericMapper<CursoResumoDTO, Curso> {
}
