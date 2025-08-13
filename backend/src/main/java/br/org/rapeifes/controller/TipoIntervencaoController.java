package br.org.rapeifes.controller;

import br.org.rapeifes.domain.TipoIntervencao;
import br.org.rapeifes.service.TipoIntervencaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-intervencao")
@RequiredArgsConstructor
public class TipoIntervencaoController {

    private final TipoIntervencaoService service;

    @GetMapping
    public List<TipoIntervencao> listarTodas() {
        return service.listarTodas();
    }
}
