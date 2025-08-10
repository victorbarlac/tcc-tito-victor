package br.org.rapeifes.service;

import br.org.rapeifes.dto.CampusDTO;
import br.org.rapeifes.mapper.CampusMapper;
import br.org.rapeifes.repository.CampusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampusService {
    private final CampusRepository repository;
    private final CampusMapper mapper;

    public List<CampusDTO> listarTodos() {
        return mapper.toDtoList(repository.findAll());
    }
}
