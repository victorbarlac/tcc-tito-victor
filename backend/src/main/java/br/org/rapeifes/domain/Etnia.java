package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "etnia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etnia {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
