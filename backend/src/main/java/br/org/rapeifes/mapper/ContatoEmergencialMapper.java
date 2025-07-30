package br.org.rapeifes.mapper;

import br.org.rapeifes.dto.ContatoEmergencialDTO;
import br.org.rapeifes.model.Aluno;
import br.org.rapeifes.model.ContatoEmergencial;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface ContatoEmergencialMapper extends GenericMapper<ContatoEmergencialDTO, ContatoEmergencial> {

    @Override
    @Mapping(source = "aluno.id", target = "alunoId")
    ContatoEmergencialDTO toDto(ContatoEmergencial entity);

    @Override
    @Mapping(target = "aluno", expression = "java(fromAlunoId(dto.getAlunoId()))")
    ContatoEmergencial toEntity(ContatoEmergencialDTO dto);

    default Aluno fromAlunoId(Long id) {
        if (id == null) return null;
        return Aluno.builder().id(id).build();
    }
}
