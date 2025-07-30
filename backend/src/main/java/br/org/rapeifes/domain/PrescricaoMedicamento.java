package br.org.rapeifes.domain;

import br.org.rapeifes.domain.id.PrescricaoMedicamentoId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "prescricao_medicamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrescricaoMedicamento {

    @EmbeddedId
    private PrescricaoMedicamentoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("alunoId")
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("medicamentoId")
    @JoinColumn(name = "medicamento_id")
    private Medicamento medicamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("profissionalId")
    @JoinColumn(name = "profissional_id")
    private ProfissionalSaude profissional;
}
