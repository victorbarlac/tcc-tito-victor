package br.org.rapeifes.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "aluno")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_seq")
    @SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_id_seq", allocationSize = 1)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(name = "nome_social", length = 255)
    private String nomeSocial;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 15)
    private String telefone;

    @Column(name = "recebe_auxilio", nullable = false)
    private Boolean recebeAuxilio;

    @Column(name = "familia_recebe_assistencia_social", nullable = false)
    private Boolean familiaRecebeAssistenciaSocial;

    @Column(name = "acompanhamento_psico_anterior", nullable = false)
    private Boolean acompanhamentoPsicoAnterior;
}
