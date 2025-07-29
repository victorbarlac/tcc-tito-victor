package br.org.rapeifes.service;

import br.org.rapeifes.model.ContatoEmergencial;
import br.org.rapeifes.repository.ContatoEmergencialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContatoEmergencialService {

    private final ContatoEmergencialRepository repository;

    public List<ContatoEmergencial> listarTodos() {
        return repository.findAll();
    }

    public ContatoEmergencial salvar(ContatoEmergencial contato) {
        return repository.save(contato);
    }

    public void deletar(Integer alunoId) {
        repository.deleteById(alunoId);
    }
}
