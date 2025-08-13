package br.org.rapeifes.controller;

import br.org.rapeifes.domain.Etnia;
import br.org.rapeifes.service.EtniaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etnia")
@RequiredArgsConstructor
public class EtniaController {

    private final EtniaService service;

    @GetMapping
    public List<Etnia> listarTodas() {
        return service.listarTodas();
    }
}
