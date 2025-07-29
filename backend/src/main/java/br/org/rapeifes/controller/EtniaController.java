package br.org.rapeifes.controller;

import br.org.rapeifes.model.Etnia;
import br.org.rapeifes.service.EtniaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etnias")
@RequiredArgsConstructor
public class EtniaController {

    private final EtniaService etniaService;

    @GetMapping
    public List<Etnia> listarEtnias() {
        return etniaService.listarTodas();
    }
}
