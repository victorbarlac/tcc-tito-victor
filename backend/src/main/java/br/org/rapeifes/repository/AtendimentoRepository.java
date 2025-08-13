package br.org.rapeifes.repository;

import br.org.rapeifes.domain.Atendimento;
import br.org.rapeifes.domain.id.AtendimentoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, AtendimentoId> {

    List<Atendimento> findByIntervencaoId(Integer intervencaoId);

}
