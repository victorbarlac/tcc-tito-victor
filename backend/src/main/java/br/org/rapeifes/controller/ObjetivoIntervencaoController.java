package br.org.rapeifes.controller;

import br.org.rapeifes.domain.ObjetivoIntervencao;
import br.org.rapeifes.service.ObjetivoIntervencaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objetivo-intervencao")
@RequiredArgsConstructor
public class ObjetivoIntervencaoController {

    private final ObjetivoIntervencaoService service;

    @GetMapping
    public List<ObjetivoIntervencao> listarTodas() {
        return service.listarTodas();
    }
}
