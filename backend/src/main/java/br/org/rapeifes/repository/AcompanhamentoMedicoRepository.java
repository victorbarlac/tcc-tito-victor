package br.org.rapeifes.repository;

import br.org.rapeifes.domain.AcompanhamentoMedico;
import br.org.rapeifes.domain.id.AcompanhamentoMedicoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcompanhamentoMedicoRepository extends JpaRepository<AcompanhamentoMedico, AcompanhamentoMedicoId> {
}
