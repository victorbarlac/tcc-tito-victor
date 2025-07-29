package br.org.rapeifes.repository;

import br.org.rapeifes.model.Etnia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtniaRepository extends JpaRepository<Etnia, Integer> {
}