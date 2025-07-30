package br.org.rapeifes.controller;

import br.org.rapeifes.domain.OrientacaoSexual;
import br.org.rapeifes.service.OrientacaoSexualService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orientacao-sexual")
@RequiredArgsConstructor
public class OrientacaoSexualController {

    private final OrientacaoSexualService orientacaoSexualService;

    @GetMapping
    public List<OrientacaoSexual> listarEtnias() {
        return orientacaoSexualService.listarTodas();
    }
}
