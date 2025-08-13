package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Atendimento;
import br.org.rapeifes.dto.AtendimentoDTO;
import br.org.rapeifes.domain.id.AtendimentoId;

import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface AtendimentoMapper extends GenericMapper<AtendimentoDTO, Atendimento> {

    @Override
    @Mapping(source = "aluno.id", target = "alunoId")
    @Mapping(source = "aluno.nome", target = "nomeAluno")
    @Mapping(source = "intervencao.id", target = "intervencaoId")
    @Mapping(source = "intervencao.local", target = "localIntervencao")
    AtendimentoDTO toDto(Atendimento entity);

    @Override
    @Mapping(target = "id", expression = "java(new br.org.rapeifes.domain.id.AtendimentoId(dto.getAlunoId(), dto.getIntervencaoId()))")
    @Mapping(source = "alunoId", target = "aluno.id")
    @Mapping(source = "intervencaoId", target = "intervencao.id")
    Atendimento toEntity(AtendimentoDTO dto);

}
