package br.org.rapeifes.dto;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Integer id;
    private String nome;
    private String email;
    private String hashSenha;
    private Integer campusId;
    private String campusNome;
}
