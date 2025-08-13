package br.org.rapeifes.controller;

import br.org.rapeifes.dto.IntervencaoDTO;
import br.org.rapeifes.service.IntervencaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intervencao")
@RequiredArgsConstructor
public class IntervencaoController {

    private final IntervencaoService service;

    @GetMapping
    public List<IntervencaoDTO> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public IntervencaoDTO listarIntervencao(@PathVariable Integer id) {
        return service.listarIntervencao(id);
    }

    @PostMapping
    public IntervencaoDTO salvar(@RequestBody IntervencaoDTO intervencaoDTO) {
        return service.salvar(intervencaoDTO);
    }

    @PutMapping
    public IntervencaoDTO alterar(@RequestBody IntervencaoDTO intervencaoDTO) {
        return service.alterar(intervencaoDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
