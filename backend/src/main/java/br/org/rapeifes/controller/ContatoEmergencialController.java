package br.org.rapeifes.controller;

import br.org.rapeifes.dto.ContatoEmergencialDTO;
import br.org.rapeifes.service.ContatoEmergencialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato-emergencial")
@RequiredArgsConstructor
public class ContatoEmergencialController {

    private final ContatoEmergencialService service;

    @GetMapping
    public List<ContatoEmergencialDTO> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public ContatoEmergencialDTO salvar(@RequestBody ContatoEmergencialDTO contato) {
        return service.salvar(contato);
    }

    @PutMapping
    public ContatoEmergencialDTO alterar(@RequestBody ContatoEmergencialDTO contato) {
        return service.alterar(contato);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
