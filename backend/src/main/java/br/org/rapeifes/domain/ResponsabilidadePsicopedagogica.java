package br.org.rapeifes.domain;

import br.org.rapeifes.domain.id.ResponsabilidadePsicopedagogicaId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "responsabilidade_psicopedagogica")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponsabilidadePsicopedagogica {

    @EmbeddedId
    private ResponsabilidadePsicopedagogicaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("alunoId")
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("usuarioId")
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
