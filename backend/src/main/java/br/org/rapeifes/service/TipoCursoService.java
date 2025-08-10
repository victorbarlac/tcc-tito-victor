package br.org.rapeifes.service;

import br.org.rapeifes.domain.TipoCurso;
import br.org.rapeifes.repository.TipoCursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoCursoService {

    private final TipoCursoRepository repository;

    public List<TipoCurso> listarTodos() {
        return repository.findAll();
    }
}
