package br.org.rapeifes.service;

import br.org.rapeifes.model.Etnia;
import br.org.rapeifes.repository.EtniaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtniaService {

    private final EtniaRepository etniaRepository;

    public List<Etnia> listarTodas() {
        return etniaRepository.findAll();
    }
}
