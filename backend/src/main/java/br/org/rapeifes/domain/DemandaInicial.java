package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "demanda_inicial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemandaInicial {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
