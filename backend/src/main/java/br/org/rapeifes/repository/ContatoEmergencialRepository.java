package br.org.rapeifes.repository;

import br.org.rapeifes.model.ContatoEmergencial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoEmergencialRepository extends JpaRepository<ContatoEmergencial, Integer> {
}
