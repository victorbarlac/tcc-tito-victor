package br.org.rapeifes.controller;

import br.org.rapeifes.dto.CoabitanteDTO;
import br.org.rapeifes.service.CoabitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coabitante")
@RequiredArgsConstructor
public class CoabitanteController {

    private final CoabitanteService service;

    @GetMapping
    public List<CoabitanteDTO> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public CoabitanteDTO salvar(@RequestBody CoabitanteDTO coabitante) {
        return service.salvar(coabitante);
    }

    @PutMapping
    public CoabitanteDTO alterar(@RequestBody CoabitanteDTO coabitante) {
        return service.alterar(coabitante);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
