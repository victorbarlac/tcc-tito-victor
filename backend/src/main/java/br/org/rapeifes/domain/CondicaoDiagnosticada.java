package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "condicao_diagnosticada")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CondicaoDiagnosticada {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
