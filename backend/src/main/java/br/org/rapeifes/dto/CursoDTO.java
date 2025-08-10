package br.org.rapeifes.dto;

import lombok.Data;

import java.util.Set;

@Data
public class CursoDTO {
    private Integer id;
    private String nome;
    private Set<CampusResumoDTO> campi;
}
