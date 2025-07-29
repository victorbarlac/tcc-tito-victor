package br.org.rapeifes.controller;

import br.org.rapeifes.model.Coabitante;
import br.org.rapeifes.service.CoabitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coabitantes")
@RequiredArgsConstructor
public class CoabitanteController {

    private final CoabitanteService service;

    @GetMapping
    public List<Coabitante> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Coabitante salvar(@RequestBody Coabitante coabitante) {
        return service.salvar(coabitante);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
