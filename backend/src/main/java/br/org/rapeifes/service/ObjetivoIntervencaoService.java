package br.org.rapeifes.service;

import br.org.rapeifes.domain.ObjetivoIntervencao;
import br.org.rapeifes.repository.ObjetivoIntervencaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ObjetivoIntervencaoService {

    private final ObjetivoIntervencaoRepository repository;

    public List<ObjetivoIntervencao> listarTodas() {
        return repository.findAll();
    }

}
