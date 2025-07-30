package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estado_acompanhamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstadoAcompanhamento {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String descricao;
}
