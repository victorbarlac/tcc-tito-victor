package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "curso")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_seq")
    @SequenceGenerator(name = "curso_seq", sequenceName = "curso_id_seq", allocationSize = 1)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "cursos")
    private Set<Campus> campi = new HashSet<>();
}
