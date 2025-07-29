package br.org.rapeifes.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orientacao_sexual")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrientacaoSexual {

    @Id
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String descricao;
}
