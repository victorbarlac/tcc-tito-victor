package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medicamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicamento_seq")
    @SequenceGenerator(name = "medicamento_seq", sequenceName = "medicamento_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "nome_substancia", nullable = false)
    private String nomeSubstancia;

    @Column(name = "exemplos_medicamentos", columnDefinition = "text")
    private String exemplosMedicamentos;
}
