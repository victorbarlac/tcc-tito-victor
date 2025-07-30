package br.org.rapeifes.repository;

import br.org.rapeifes.domain.ContatoEmergencial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoEmergencialRepository extends JpaRepository<ContatoEmergencial, Long> {
}
