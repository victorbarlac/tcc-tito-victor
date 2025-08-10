package br.org.rapeifes.dto;

import lombok.Data;

import java.util.Set;

@Data
public class CampusDTO {
    private Integer id;
    private String nome;
    private Set<CursoResumoDTO> cursos;
}
