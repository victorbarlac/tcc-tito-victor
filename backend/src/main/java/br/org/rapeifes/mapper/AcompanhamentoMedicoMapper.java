package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.AcompanhamentoMedico;
import br.org.rapeifes.dto.AcompanhamentoMedicoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AcompanhamentoMedicoMapper extends GenericMapper<AcompanhamentoMedicoDTO, AcompanhamentoMedico>  {

    @Override
    @Mapping(source = "aluno.id", target = "alunoId")
    @Mapping(source = "profissional.id", target = "profissionalId")
    @Mapping(source = "estadoAcompanhamento.id", target = "estadoAcompanhamentoId")
    AcompanhamentoMedicoDTO toDto(AcompanhamentoMedico entity);

    @Override
    @Mapping(target = "id", expression = "java(new br.org.rapeifes.domain.id.AcompanhamentoMedicoId(dto.getAlunoId(), dto.getProfissionalId(), dto.getEstadoAcompanhamentoId()))")
    @Mapping(source = "alunoId", target = "aluno.id")
    @Mapping(source = "profissionalId", target = "profissional.id")
    @Mapping(source = "estadoAcompanhamentoId", target = "estadoAcompanhamento.id")
    AcompanhamentoMedico toEntity(AcompanhamentoMedicoDTO dto);

}
