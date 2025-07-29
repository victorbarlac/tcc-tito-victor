package br.org.rapeifes.service;

import br.org.rapeifes.model.Coabitante;
import br.org.rapeifes.repository.CoabitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoabitanteService {

    private final CoabitanteRepository repository;

    public List<Coabitante> listarTodos() {
        return repository.findAll();
    }

    public Coabitante salvar(Coabitante coabitante) {
        return repository.save(coabitante);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
