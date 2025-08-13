package br.org.rapeifes.service;

import br.org.rapeifes.domain.TipoIntervencao;
import br.org.rapeifes.repository.TipoIntervencaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoIntervencaoService {

    private final TipoIntervencaoRepository repository;

    public List<TipoIntervencao> listarTodas() {
        return repository.findAll();
    }

}
