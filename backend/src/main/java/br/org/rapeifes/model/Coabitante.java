package br.org.rapeifes.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "coabitante",
        uniqueConstraints = @UniqueConstraint(columnNames = {"aluno_id", "descricao"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coabitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
}
