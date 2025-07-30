package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "encaminhamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Encaminhamento {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
