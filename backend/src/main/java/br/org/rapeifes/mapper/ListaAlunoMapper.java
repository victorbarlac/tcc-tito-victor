package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Aluno;
import br.org.rapeifes.dto.ListaAlunoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ListaAlunoMapper extends GenericMapper<ListaAlunoDTO, Aluno> {
}