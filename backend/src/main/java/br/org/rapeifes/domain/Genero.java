package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genero")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Genero {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
