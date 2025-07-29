package br.org.rapeifes.service;

import br.org.rapeifes.model.Genero;
import br.org.rapeifes.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GeneroService {

    private final GeneroRepository generoRepository;

    public List<Genero> listarTodas() {
        return generoRepository.findAll();
    }
}
