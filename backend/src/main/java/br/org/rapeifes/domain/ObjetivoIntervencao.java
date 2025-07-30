package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "objetivo_intervencao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObjetivoIntervencao {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
