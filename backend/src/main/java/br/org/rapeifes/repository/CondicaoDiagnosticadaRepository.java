package br.org.rapeifes.repository;

import br.org.rapeifes.domain.CondicaoDiagnosticada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicaoDiagnosticadaRepository extends JpaRepository<CondicaoDiagnosticada, Integer> {
}
