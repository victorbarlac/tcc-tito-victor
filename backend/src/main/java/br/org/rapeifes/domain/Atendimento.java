package br.org.rapeifes.domain;

import br.org.rapeifes.domain.id.AtendimentoId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "atendimento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Atendimento {

    @EmbeddedId
    private AtendimentoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("alunoId")
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("intervencaoId")
    @JoinColumn(name = "intervencao_id")
    private Intervencao intervencao;
}
