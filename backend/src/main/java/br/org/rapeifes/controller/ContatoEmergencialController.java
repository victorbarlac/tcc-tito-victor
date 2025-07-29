package br.org.rapeifes.controller;

import br.org.rapeifes.model.ContatoEmergencial;
import br.org.rapeifes.service.ContatoEmergencialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos-emergenciais")
@RequiredArgsConstructor
public class ContatoEmergencialController {

    private final ContatoEmergencialService service;

    @GetMapping
    public List<ContatoEmergencial> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public ContatoEmergencial salvar(@RequestBody ContatoEmergencial contato) {
        return service.salvar(contato);
    }

    @DeleteMapping("/{alunoId}")
    public void deletar(@PathVariable Integer alunoId) {
        service.deletar(alunoId);
    }
}
