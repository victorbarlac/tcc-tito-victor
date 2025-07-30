package br.org.rapeifes.mapper;

import br.org.rapeifes.dto.CoabitanteDTO;
import br.org.rapeifes.model.Aluno;
import br.org.rapeifes.model.Coabitante;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CoabitanteMapper extends GenericMapper<CoabitanteDTO, Coabitante> {

    @Override
    @Mapping(source = "aluno.id", target = "alunoId")
    CoabitanteDTO toDto(Coabitante entity);

    @Override
    @Mapping(target = "aluno", expression = "java(fromAlunoId(dto.getAlunoId()))")
    Coabitante toEntity(CoabitanteDTO dto);

    default Aluno fromAlunoId(Long id) {
        if (id == null) return null;
        return Aluno.builder().id(id).build();
    }
}
