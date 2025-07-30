package br.org.rapeifes.repository;

import br.org.rapeifes.domain.OrientacaoSexual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrientacaoSexualRepository  extends JpaRepository<OrientacaoSexual, Integer> {
}
