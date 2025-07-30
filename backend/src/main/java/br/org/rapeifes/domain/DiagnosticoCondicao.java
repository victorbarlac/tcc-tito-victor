package br.org.rapeifes.domain;

import br.org.rapeifes.domain.id.DiagnosticoCondicaoId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "diagnostico_condicao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiagnosticoCondicao {

    @EmbeddedId
    private DiagnosticoCondicaoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("alunoId")
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("profissionalId")
    @JoinColumn(name = "profissional_id")
    private ProfissionalSaude profissional;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("condicaoId")
    @JoinColumn(name = "condicao_id")
    private CondicaoDiagnosticada condicao;
}
