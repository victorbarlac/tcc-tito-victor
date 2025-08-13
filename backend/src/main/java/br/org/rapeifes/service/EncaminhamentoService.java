package br.org.rapeifes.service;

import br.org.rapeifes.domain.Encaminhamento;
import br.org.rapeifes.repository.EncaminhamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EncaminhamentoService {

    private final EncaminhamentoRepository repository;

    public List<Encaminhamento> listarTodas() {
        return repository.findAll();
    }

}
