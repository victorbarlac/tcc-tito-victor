package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "encaminhador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Encaminhador {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
