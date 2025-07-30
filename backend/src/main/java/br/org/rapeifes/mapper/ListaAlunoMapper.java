package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.Aluno;
import br.org.rapeifes.dto.ListaAlunoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ListaAlunoMapper extends GenericMapper<ListaAlunoDTO, Aluno> {
//
//    @Override
//    @Mapping(source = "etnia.id", target = "etniaId")
//    @Mapping(source = "etnia.descricao", target = "descricaoEtnia")
//    @Mapping(source = "genero.id", target = "generoId")
//    @Mapping(source = "genero.descricao", target = "descricaoGenero")
//    @Mapping(source = "orientacaoSexual.id", target = "orientacaoSexualId")
//    @Mapping(source = "orientacaoSexual.descricao", target = "descricaoOrientacaoSexual")
//    AlunoDTO toDto(Aluno entity);
//
//    @Override
//    @Mapping(source = "etniaId", target = "etnia.id")
//    @Mapping(source = "descricaoEtnia", target = "etnia.descricao")
//    @Mapping(source = "generoId", target = "genero.id")
//    @Mapping(source = "descricaoGenero", target = "genero.descricao")
//    @Mapping(source = "orientacaoSexualId", target = "orientacaoSexual.id")
//    @Mapping(source = "descricaoOrientacaoSexual", target = "orientacaoSexual.descricao")
//    Aluno toEntity(AlunoDTO dto);

}