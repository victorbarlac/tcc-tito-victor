package br.org.rapeifes.controller;

import br.org.rapeifes.domain.CondicaoDiagnosticada;
import br.org.rapeifes.service.CondicaoDiagnosticadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/condicao-diagnosticada")
@RequiredArgsConstructor
public class CondicaoDiagnosticadaController {

    private final CondicaoDiagnosticadaService service;

    @GetMapping
    public List<CondicaoDiagnosticada> listarTodas() {
        return service.listarTodas();
    }
}
