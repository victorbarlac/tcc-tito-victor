package br.org.rapeifes.service;

import br.org.rapeifes.domain.Encaminhador;
import br.org.rapeifes.repository.EncaminhadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EncaminhadorService {

    private final EncaminhadorRepository repository;

    public List<Encaminhador> listarTodas() {
        return repository.findAll();
    }

}
