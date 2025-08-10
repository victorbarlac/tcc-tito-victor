package br.org.rapeifes.repository;

import br.org.rapeifes.domain.Campus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampusRepository extends JpaRepository<Campus, Integer> {
}
