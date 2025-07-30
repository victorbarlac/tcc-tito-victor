package br.org.rapeifes.mapper;

import br.org.rapeifes.dto.AlunoDTO;
import br.org.rapeifes.model.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AlunoMapper extends GenericMapper<AlunoDTO, Aluno> {

    @Override
    @Mapping(source = "etnia.id", target = "etniaId")
    @Mapping(source = "etnia.descricao", target = "descricaoEtnia")
    @Mapping(source = "genero.id", target = "generoId")
    @Mapping(source = "genero.descricao", target = "descricaoGenero")
    @Mapping(source = "orientacaoSexual.id", target = "orientacaoSexualId")
    @Mapping(source = "orientacaoSexual.descricao", target = "descricaoOrientacaoSexual")
    AlunoDTO toDto(Aluno entity);

    @Override
    @Mapping(source = "etniaId", target = "etnia.id")
    @Mapping(source = "descricaoEtnia", target = "etnia.descricao")
    @Mapping(source = "generoId", target = "genero.id")
    @Mapping(source = "descricaoGenero", target = "genero.descricao")
    @Mapping(source = "orientacaoSexualId", target = "orientacaoSexual.id")
    @Mapping(source = "descricaoOrientacaoSexual", target = "orientacaoSexual.descricao")
    Aluno toEntity(AlunoDTO dto);

}
