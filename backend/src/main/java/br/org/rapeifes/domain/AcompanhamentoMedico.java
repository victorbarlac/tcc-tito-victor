package br.org.rapeifes.domain;

import br.org.rapeifes.domain.id.AcompanhamentoMedicoId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "acompanhamento_medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AcompanhamentoMedico {

    @EmbeddedId
    private AcompanhamentoMedicoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("alunoId")
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("profissionalId")
    @JoinColumn(name = "profissional_id")
    private ProfissionalSaude profissional;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("estadoAcompanhamentoId")
    @JoinColumn(name = "estado_acompanhamento_id")
    private EstadoAcompanhamento estadoAcompanhamento;
}
