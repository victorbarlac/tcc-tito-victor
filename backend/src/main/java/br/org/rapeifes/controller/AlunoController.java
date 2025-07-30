package br.org.rapeifes.controller;

import br.org.rapeifes.dto.AlunoDTO;
import br.org.rapeifes.dto.ListaAlunoDTO;
import br.org.rapeifes.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @GetMapping
    public List<ListaAlunoDTO> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public AlunoDTO listarAluno(@PathVariable Integer id) {
        return service.listarAluno(id);
    }

    @PostMapping
    public AlunoDTO salvar(@RequestBody AlunoDTO alunoDTO) {
        return service.salvar(alunoDTO);
    }

    @PutMapping
    public AlunoDTO alterar(@RequestBody AlunoDTO alunoDTO) {
        return service.alterar(alunoDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
