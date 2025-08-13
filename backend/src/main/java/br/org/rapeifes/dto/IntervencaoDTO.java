package br.org.rapeifes.dto;

import lombok.Data;
import org.mapstruct.Mapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class IntervencaoDTO {

    private Integer id;

    private LocalDate data;

    private String local;

    private Integer tipoIntervencaoId;

    private String descricaoTipoIntervencao;

    private Integer encaminhadorId;

    private String descricaoEncaminhador;

    private Integer encaminhamentoId;

    private String descricaoEncaminhamento;

    private Integer demandaInicialId;

    private String descricaoDemandaInicial;

    private Integer objetivoIntervencaoId;

    private String descricaoObjetivoIntervencao;

    private List<AtendimentoDTO> alunoIds = new ArrayList<>();
}
