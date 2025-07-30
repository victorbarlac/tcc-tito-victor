package br.org.rapeifes.service;

import br.org.rapeifes.dto.ContatoEmergencialDTO;
import br.org.rapeifes.mapper.ContatoEmergencialMapper;
import br.org.rapeifes.repository.ContatoEmergencialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContatoEmergencialService {

    private final ContatoEmergencialRepository repository;
    private final ContatoEmergencialMapper mapper;

    public List<ContatoEmergencialDTO> listarTodos() {
        return mapper.toDtoList(repository.findAll());
    }

    public ContatoEmergencialDTO salvar(ContatoEmergencialDTO dto) {
        var entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    public ContatoEmergencialDTO alterar(ContatoEmergencialDTO dto) {
        var entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    public void deletar(Long id) {
        repository.deleteById(Math.toIntExact(id));
    }
}

