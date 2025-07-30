package br.org.rapeifes.service;

import br.org.rapeifes.dto.CoabitanteDTO;
import br.org.rapeifes.mapper.CoabitanteMapper;
import br.org.rapeifes.repository.CoabitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoabitanteService {

    private final CoabitanteRepository repository;
    private final CoabitanteMapper mapper;

    public List<CoabitanteDTO> listarTodos() {
        return mapper.toDtoList(repository.findAll());
    }

    public CoabitanteDTO salvar(CoabitanteDTO dto) {
        var entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    public CoabitanteDTO alterar(CoabitanteDTO dto) {
        var entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
