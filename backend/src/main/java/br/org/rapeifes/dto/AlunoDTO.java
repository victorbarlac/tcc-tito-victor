package br.org.rapeifes.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AlunoDTO {

    private Long id;

    private String nome;

    private String email;

    private String nomeSocial;

    private LocalDate dataNascimento;

    private String telefone;

    private Boolean recebeAuxilio;

    private Boolean familiaRecebeAssistenciaSocial;

    private Boolean acompanhamentoPsicoAnterior;

    private Long etniaId;
    private String descricaoEtnia;

    private Long generoId;
    private String descricaoGenero;

    private Long orientacaoSexualId;
    private String descricaoOrientacaoSexual;

}
