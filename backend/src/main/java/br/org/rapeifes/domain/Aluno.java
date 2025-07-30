package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "aluno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_seq")
    @SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_id_seq", allocationSize = 1)
    private Integer id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nome;

    @Column(name = "nome_social")
    private String nomeSocial;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 15)
    private String telefone;

    @Column(name = "recebe_auxilio", nullable = false)
    private boolean recebeAuxilio;

    @Column(name = "familia_recebe_assistencia_social", nullable = false)
    private boolean familiaRecebeAssistenciaSocial;

    @Column(name = "acompanhamento_psico_anterior", nullable = false)
    private boolean acompanhamentoPsicoAnterior;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ContatoEmergencial> contatosEmergenciais = new HashSet<>();

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Coabitante> coabitantes = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "etnia_id", referencedColumnName = "id")
    private Etnia etnia;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "orientacao_sexual_id", referencedColumnName = "id")
    private OrientacaoSexual orientacaoSexual;
//
//    @ManyToOne
//    @JoinColumn(name = "curso_id")
//    private Curso curso;
}
