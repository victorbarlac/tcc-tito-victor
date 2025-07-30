package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Aluno;
import br.org.rapeifes.domain.Coabitante;
import br.org.rapeifes.dto.CoabitanteDTO;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CoabitanteMapper extends GenericMapper<CoabitanteDTO, Coabitante> {

    @Mapping(source = "aluno.id", target = "alunoId")
    CoabitanteDTO toDto(Coabitante entity);

    @Mapping(target = "aluno", expression = "java(fromAlunoId(dto.getAlunoId()))")
    Coabitante toEntity(CoabitanteDTO dto);

    default Aluno fromAlunoId(Integer id) {
        if (id == null) return null;
        return Aluno.builder().id(id).build();
    }
}
