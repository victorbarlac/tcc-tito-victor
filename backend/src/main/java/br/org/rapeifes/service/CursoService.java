package br.org.rapeifes.service;

import br.org.rapeifes.domain.TipoCurso;
import br.org.rapeifes.dto.CursoDTO;
import br.org.rapeifes.mapper.CursoMapper;
import br.org.rapeifes.repository.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoRepository repository;
    private final TipoCursoService cursoService;
    private final CursoMapper mapper;

    public List<CursoDTO> listarTodos() {
        return mapper.toDtoList(repository.findAll());
    }

    public CursoDTO buscarCurso(Integer id) {
        return mapper.toDto(repository.findById(id).get());
    }

    public List<TipoCurso> listarTodosTipoCurso() {
        return cursoService.listarTodos();
    }
}
