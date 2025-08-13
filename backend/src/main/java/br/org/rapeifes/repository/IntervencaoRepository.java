package br.org.rapeifes.repository;

import br.org.rapeifes.domain.Intervencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntervencaoRepository extends JpaRepository<Intervencao, Integer> {
}
