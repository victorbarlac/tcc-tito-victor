package br.org.rapeifes.service;

import br.org.rapeifes.domain.DemandaInicial;
import br.org.rapeifes.repository.DemandaInicialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemandaInicialService {

    private final DemandaInicialRepository repository;

    public List<DemandaInicial> listarTodas() {
        return repository.findAll();
    }

}
