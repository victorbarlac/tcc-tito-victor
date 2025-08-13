package br.org.rapeifes.controller;

import br.org.rapeifes.domain.ProfissionalSaude;
import br.org.rapeifes.service.ProfissionalSaudeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissional-saude")
@RequiredArgsConstructor
public class ProfissionalSaudeController {

    private final ProfissionalSaudeService service;

    @GetMapping
    public List<ProfissionalSaude> listarTodas() {
        return service.listarTodas();
    }
}
