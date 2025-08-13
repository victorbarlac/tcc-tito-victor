package br.org.rapeifes.controller;

import br.org.rapeifes.domain.Encaminhamento;
import br.org.rapeifes.service.EncaminhamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encaminhamento")
@RequiredArgsConstructor
public class EncaminhamentoController {

    private final EncaminhamentoService service;

    @GetMapping
    public List<Encaminhamento> listarTodas() {
        return service.listarTodas();
    }
}
