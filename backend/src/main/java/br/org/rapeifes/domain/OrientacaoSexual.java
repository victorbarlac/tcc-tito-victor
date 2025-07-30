package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orientacao_sexual")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrientacaoSexual {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
