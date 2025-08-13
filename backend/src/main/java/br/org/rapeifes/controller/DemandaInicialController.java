package br.org.rapeifes.controller;

import br.org.rapeifes.domain.DemandaInicial;
import br.org.rapeifes.service.DemandaInicialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demanda-inicial")
@RequiredArgsConstructor
public class DemandaInicialController {

    private final DemandaInicialService service;

    @GetMapping
    public List<DemandaInicial> listarTodas() {
        return service.listarTodas();
    }
}
