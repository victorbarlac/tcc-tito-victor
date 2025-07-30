package br.org.rapeifes.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genero")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Genero {

    @Id
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, length = 255)
    private String descricao;
}
