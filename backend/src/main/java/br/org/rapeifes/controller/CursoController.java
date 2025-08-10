package br.org.rapeifes.controller;

import br.org.rapeifes.domain.TipoCurso;
import br.org.rapeifes.dto.CursoDTO;
import br.org.rapeifes.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService service;

    @GetMapping
    public List<CursoDTO> listarCursos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public CursoDTO buscarCurso(@PathVariable Integer id) {
        return service.buscarCurso(id);
    }

    @GetMapping("/tipos")
    public List<TipoCurso> listarTipoCurso() {
        return service.listarTodosTipoCurso();
    }

}
