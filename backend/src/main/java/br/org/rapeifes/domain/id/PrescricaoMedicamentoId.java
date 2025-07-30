package br.org.rapeifes.domain.id;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescricaoMedicamentoId implements Serializable {
    private Integer alunoId;
    private Integer medicamentoId;
    private Integer profissionalId;
}
