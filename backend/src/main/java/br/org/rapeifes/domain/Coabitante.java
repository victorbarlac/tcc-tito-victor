package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "coabitante",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_coabitante",
                columnNames = {"aluno_id", "descricao"}
        )
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coabitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Id surrogate recomendado

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @Column(nullable = false)
    private String descricao;
}
