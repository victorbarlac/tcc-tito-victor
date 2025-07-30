package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "campus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campus_seq")
    @SequenceGenerator(name = "campus_seq", sequenceName = "campus_id_seq", allocationSize = 1)
    private Integer id;

    @Column(nullable = false, length = 1024)
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "campus_curso",
            joinColumns = @JoinColumn(name = "campus_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private Set<Curso> cursos = new HashSet<>();
}
