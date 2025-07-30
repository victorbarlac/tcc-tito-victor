package br.org.rapeifes.dto;

import lombok.Data;

@Data
public class ContatoEmergencialDTO {

    private Integer id;

    private Integer alunoId;

    private String nomeResponsavel;

    private String telefoneResponsavel;
}
