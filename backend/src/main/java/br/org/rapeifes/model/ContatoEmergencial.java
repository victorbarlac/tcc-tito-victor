package br.org.rapeifes.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contato_emergencial",
        uniqueConstraints = @UniqueConstraint(columnNames = {"aluno_id", "nome_responsavel"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContatoEmergencial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

    @Column(name = "nome_responsavel", nullable = false, length = 255)
    private String nomeResponsavel;

    @Column(name = "telefone_responsavel", nullable = false, length = 15)
    private String telefoneResponsavel;
}
