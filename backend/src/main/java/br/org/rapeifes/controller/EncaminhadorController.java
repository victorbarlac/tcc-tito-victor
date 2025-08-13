package br.org.rapeifes.controller;

import br.org.rapeifes.domain.DemandaInicial;
import br.org.rapeifes.domain.Encaminhador;
import br.org.rapeifes.service.DemandaInicialService;
import br.org.rapeifes.service.EncaminhadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encaminhador")
@RequiredArgsConstructor
public class EncaminhadorController {

    private final EncaminhadorService service;

    @GetMapping
    public List<Encaminhador> listarTodas() {
        return service.listarTodas();
    }
}
