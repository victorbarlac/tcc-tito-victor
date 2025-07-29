package br.org.rapeifes.controller;

import br.org.rapeifes.model.Genero;
import br.org.rapeifes.service.GeneroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
@RequiredArgsConstructor
public class GeneroController {

    private final GeneroService generoService;

    @GetMapping
    public List<Genero> listarEtnias() {
        return generoService.listarTodas();
    }
}
