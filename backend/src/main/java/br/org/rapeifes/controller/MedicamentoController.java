package br.org.rapeifes.controller;

import br.org.rapeifes.domain.Medicamento;
import br.org.rapeifes.service.MedicamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamento")
@RequiredArgsConstructor
public class MedicamentoController {

    private final MedicamentoService service;

    @GetMapping
    public List<Medicamento> listarTodas() {
        return service.listarTodas();
    }
}
