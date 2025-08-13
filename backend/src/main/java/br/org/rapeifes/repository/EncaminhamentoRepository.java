package br.org.rapeifes.repository;

import br.org.rapeifes.domain.Encaminhamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncaminhamentoRepository extends JpaRepository<Encaminhamento, Integer> {
}
