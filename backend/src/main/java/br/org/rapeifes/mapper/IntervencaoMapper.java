package br.org.rapeifes.mapper;

import br.org.rapeifes.domain.*;
import br.org.rapeifes.dto.IntervencaoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IntervencaoMapper  extends GenericMapper<IntervencaoDTO, Intervencao> {

    @Override
    @Mapping(source = "tipoIntervencao.id", target = "tipoIntervencaoId")
    @Mapping(source = "tipoIntervencao.nome", target = "descricaoTipoIntervencao")
    @Mapping(source = "encaminhador.id", target = "encaminhadorId")
    @Mapping(source = "encaminhador.descricao", target = "descricaoEncaminhador")
    @Mapping(source = "encaminhamento.id", target = "encaminhamentoId")
    @Mapping(source = "encaminhamento.descricao", target = "descricaoEncaminhamento")
    @Mapping(source = "demandaInicial.id", target = "demandaInicialId")
    @Mapping(source = "demandaInicial.descricao", target = "descricaoDemandaInicial")
    @Mapping(source = "objetivoIntervencao.id", target = "objetivoIntervencaoId")
    @Mapping(source = "objetivoIntervencao.descricao", target = "descricaoObjetivoIntervencao")
    IntervencaoDTO toDto(Intervencao entity);

    @Override
    @Mapping(source = "tipoIntervencaoId", target = "tipoIntervencao.id")
    @Mapping(source = "descricaoTipoIntervencao", target = "tipoIntervencao.nome")
    @Mapping(source = "encaminhadorId", target = "encaminhador.id")
    @Mapping(source = "descricaoEncaminhador", target = "encaminhador.descricao")
    @Mapping(source = "encaminhamentoId", target = "encaminhamento.id")
    @Mapping(source = "descricaoEncaminhamento", target = "encaminhamento.descricao")
    @Mapping(source = "demandaInicialId", target = "demandaInicial.id")
    @Mapping(source = "descricaoDemandaInicial", target = "demandaInicial.descricao")
    @Mapping(source = "objetivoIntervencaoId", target = "objetivoIntervencao.id")
    @Mapping(source = "descricaoObjetivoIntervencao", target = "objetivoIntervencao.descricao")
    Intervencao toEntity(IntervencaoDTO dto);

}
