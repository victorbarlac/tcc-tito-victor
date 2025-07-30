package br.org.rapeifes.dto;

import lombok.Data;

@Data
public class ContatoEmergencialDTO {

    private Long id;

    private Long alunoId;

    private String nomeResponsavel;

    private String telefoneResponsavel;
}
