package br.org.rapeifes.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AlunoDTO {

    private Integer id;

    private String nome;

    private String email;

    private String nomeSocial;

    private LocalDate dataNascimento;

    private String telefone;

    private Boolean recebeAuxilio;

    private Boolean familiaRecebeAssistenciaSocial;

    private Boolean acompanhamentoPsicoAnterior;

    private Integer etniaId;
    private String descricaoEtnia;

    private Integer generoId;
    private String descricaoGenero;

    private Integer orientacaoSexualId;
    private String descricaoOrientacaoSexual;

}
