package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "contato_emergencial",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_contato_emergencial",
                columnNames = {"aluno_id", "nome_responsavel"}
        )
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContatoEmergencial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @Column(name = "nome_responsavel", nullable = false)
    private String nomeResponsavel;

    @Column(name = "telefone_responsavel", nullable = false, length = 15)
    private String telefoneResponsavel;
}
